package com.spring.factorybean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class ZFFactoryBean implements FactoryBean<Object>, InitializingBean, DisposableBean {

    private String interfaceName;
    private Object target;

    private Object proxyObj;

    public void destroy() throws Exception {
        System.out.println("distory...");
    }

    public void afterPropertiesSet() throws Exception {

        proxyObj = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                                          new Class[] { Class.forName(interfaceName) }, new InvocationHandler() {

                                              public Object invoke(Object proxy, Method method, Object[] args)
                                                                                                              throws Throwable {
                                                  System.out.println("method:" + method.getName());
                                                  System.out.println("HSF invoke...");
                                                  method.invoke(target, args);
                                                  System.out.println("HSF success...");
                                                  return null;
                                              }
                                          });

        System.out.println("afterPropertiesSet");
    }

    public Object getObject() throws Exception {
        System.out.println("getObject");
        return proxyObj;
    }

    public Class<?> getObjectType() {
        return proxyObj == null ? Object.class : proxyObj.getClass();
    }

    public boolean isSingleton() {
        return true;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxyObj() {
        return proxyObj;
    }

    public void setProxyObj(Object proxyObj) {
        this.proxyObj = proxyObj;
    }

}

package com.spring.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

public class ZFBeanFactory implements BeanFactory , BeanFactoryAware{
	
	private BeanFactory beanFactory ;
	
	private String interfaceName ;
	
	private String target ;

	public boolean containsBean(String name) {
		return true;
	}

	public String[] getAliases(String name) {
		return null;
	}

	public Object getBean(String id) throws BeansException {
		return null;
	}

	public <T> T getBean(Class<T> arg0) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getBean(String arg0, Class<T> arg1) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getBean(String arg0, Object... arg1) throws BeansException {
		return null;
	}

	public Class<?> getType(String id) throws NoSuchBeanDefinitionException {
		try {
			return Class.forName(interfaceName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null ;
	}

	public boolean isPrototype(String arg0)
			throws NoSuchBeanDefinitionException {
		return false;
	}

	public boolean isSingleton(String arg0)
			throws NoSuchBeanDefinitionException {
		return false;
	}

	public boolean isTypeMatch(String arg0, Class arg1)
			throws NoSuchBeanDefinitionException {
		return true;
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory ;
	}

}

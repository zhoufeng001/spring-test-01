package com.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.ZFBeanProcessor;
import com.spring.service.PersonService;

public class Test01 {

	ClassPathXmlApplicationContext context ;
	ConfigurableListableBeanFactory beanFactory ;

	@Before
	public void init(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		beanFactory = context.getBeanFactory() ;
	}


	@Test
	public void test01(){

		PersonService ps = context.getBean("personService" , PersonService.class);

		ps.sayHello(); 

		String name = ps.getName() ;

		System.out.println(name);
	}

	@Test
	public void test02(){
		PersonService ps = context.getBean("personServiceByLog" , PersonService.class) ;
		ps.sayHello();

		String name = ps.getName() ;

		System.out.println(name);

	}

	@Test
	public void test03(){
		beanFactory.addBeanPostProcessor(new ZFBeanProcessor());
		PersonService ps = beanFactory.getBean("personServiceByLog" , PersonService.class) ;
		ps.sayHello();
		String name = ps.getName() ;
		System.out.println(name);
	}


	@Test
	public void test04(){
		ProxyFactoryBean factoryBean = context.getBean("&personServiceByLog" , ProxyFactoryBean.class) ;
		PersonService ps = (PersonService) factoryBean.getObject() ;
		String name = ps.getName() ;
		System.out.println(name);

	}
	
	@Test
	public void test05(){
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory() ;
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory) ; 
		reader.loadBeanDefinitions(resource) ;
		
		PersonService ps = factory.getBean("personService" , PersonService.class);
		
		ps.sayHello(); 

		String name = ps.getName() ;
 
		System.out.println(name);
	}

	
}

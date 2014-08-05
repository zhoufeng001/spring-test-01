package com.spring.jndi.impl;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;

import com.spring.jndi.MyService;

public class MyServiceImpl implements Referenceable, MyService {

    private String location = "";

    public String sayHello(String name) {
        return String.format("hello %s!", name);
    }

    public Reference getReference() throws NamingException {
        return new Reference(getClass().getName(), MyService.class.getName(), null);
    }

}

package com.spring.jndi;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;

import com.spring.jndi.impl.MyServiceImpl;

public class MyJNDIFactory implements ObjectFactory {

    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) {
        if (obj instanceof Reference) {
            return new MyServiceImpl();
        }
        return null;
    }

}

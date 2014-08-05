package com.spring.jndi;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JNDIServer {

    public static void main(String[] args) throws NamingException {

        Hashtable env = new Hashtable();

        env.put(Context.INITIAL_CONTEXT_FACTORY,

        "com.sun.jndi.fscontext.RefFSContextFactory");

        env.put(Context.PROVIDER_URL, "t3://localhost:7001");

        InitialContext context = new InitialContext(env);

    }

}

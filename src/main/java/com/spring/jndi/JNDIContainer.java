package com.spring.jndi;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.spring.jndi.impl.MyServiceImpl;

public class JNDIContainer {

    public static void main(String[] args) throws NamingException {

        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
        env.put(Context.PROVIDER_URL, "file:/e:/"); // fscontext的初始目录，我们需要在c:\下创建sample目录。
        Context ctx = new InitialContext(env);
        ctx.rebind("com.spring.jndi.MyService", new MyServiceImpl());

        MyService service = (MyService) ctx.lookup("MyService");
        String str = service.sayHello("is_zhoufeng");
        System.out.println(str);

        ctx.close();
    }

}

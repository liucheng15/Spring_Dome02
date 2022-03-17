package org.db.soft.base;

import org.db.soft.dao.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("configuration.xml");
        Server server=applicationContext.getBean("server",Server.class);
        server.operation();
    }
}

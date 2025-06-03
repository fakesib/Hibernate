package com.fakesibwork.hibernate;

import org.hibernate.cfg.Configuration;

public class HibernateStarter {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        try (var sessionFactory = configuration.buildSessionFactory();
                var session = sessionFactory.openSession();) {
            System.out.println("OK");
        }
    }
}

package com.fakesibwork.hibernate;

import com.fakesibwork.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateStarter {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(User.class);


        // Transient
        var user = User.builder()
                .username("user")
                .password("user")
                .build();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession();) {
            session.beginTransaction();

            // Persistent
            session.save(user);

            // Closing transaction and commiting to database
            session.getTransaction().commit();
        }

    }
}

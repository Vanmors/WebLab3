package ru.javastudy.beans.DBWork;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WorkWithDB {
    private static final SessionFactory sessionFactory = (SessionFactory) new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(CoordinateData.class);


}

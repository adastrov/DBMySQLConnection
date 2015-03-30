package com.devcolibri;

import com.devcolibri.entity.User;
import com.devcolibri.persistence.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        // Алгоритм записи сведений в БД
        User user = new User();

        user.setFirstName("Pavel");
        user.setLastName("Padalka");
        user.setEmail("padalkapavel@gmail.com");

        session.save(user);
        session.getTransaction().commit();

        // Алгоритм получения сведений из БД

    }

}
package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.entity.Product;
import com.demo.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate App" );
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        transaction.commit();
//		create entity
		Product product = new Product();
		product.setProductId("P02");
		product.setProductName("ANGULAR");
		product.setPrice(500);
		session.save(product);
        session.close();
    }
    
}

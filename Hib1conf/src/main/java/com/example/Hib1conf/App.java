package com.example.Hib1conf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee employee = new Employee();
       employee.empid=1;
       employee.name="Harry";
       employee.lname="Hibare";
       
       Configuration con =new Configuration().configure().addAnnotatedClass(Employee.class);
       SessionFactory sf=con.buildSessionFactory();
       Session session=sf.openSession();
       Transaction tx = session.beginTransaction();
       
       session.save(employee);
       tx.commit();
    }
}

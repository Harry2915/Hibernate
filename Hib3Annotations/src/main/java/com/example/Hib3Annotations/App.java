package com.example.Hib3Annotations;

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
    	 Configuration con =new Configuration().configure().addAnnotatedClass(Employee.class);
         SessionFactory sf=con.buildSessionFactory();
         Session session=sf.openSession();
         Transaction tx = session.beginTransaction();
         
         Employee employee = new Employee();
         employee.emp_id=1;
         employee.fname="Harish";
         employee.lname="Hibare";
         session.save(employee);
         tx.commit();
    }
}

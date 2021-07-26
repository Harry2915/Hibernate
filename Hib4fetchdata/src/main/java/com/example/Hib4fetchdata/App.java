package com.example.Hib4fetchdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration con =new Configuration().configure().addAnnotatedClass(Employee.class);
    	 ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	 SessionFactory sf=con.buildSessionFactory(reg);
         Session session=sf.openSession();
         Transaction tx = session.beginTransaction();
         
         Employee employee = new Employee();
//         employee.emp_id=1;
//         employee.fname="Harish";
//         employee.lname="Hibare";
         
         
         employee=(Employee) session.get(Employee.class, 1);
         System.out.println(employee);
         tx.commit();
    }
}

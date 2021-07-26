package com.example.Hib5Embeddableobj;

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
         
         Address address = new Address();
         address.setCity("Solapur");
         address.setStreet("AmolNagar");
         
         Employee employee = new Employee();
         
         employee.setFname("Harry");
         employee.setLname("Hibare");
         employee.setAddress(address);
         
         
         session.save(employee);
         
        
         tx.commit();
         session.close();
    }
}

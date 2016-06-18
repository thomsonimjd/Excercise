package Emp;

import org.hibernate.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageEmp {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
        Configuration configuration = new Configuration().configure();
        
        // 2. create sessionfactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // 3. Get Session object
        Session session = sessionFactory.openSession();

        // 4. Starting Transaction
        Transaction transaction = session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setEmpId(126);
		emp.setEmpName("Thomson");
		
		session.save(emp);
		transaction.commit();
		session.close();
		

		
	}

}

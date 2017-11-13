


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HibernateMain {
	
private static SessionFactory sessionFactory = null;
private static SessionFactory configure()	{
	sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	return sessionFactory;
			
}

public static void main (String[] args) {
	configure();
	Session session = null;
	Transaction tx = null;
	
	try {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Player p = new Player("Sara",false);
		session.save(p);
		tx.commit();
	}
	catch (Exception e){
	System.out.println(e.getMessage());
	
	
	
		
	}finally {
		
		if (session != null) {
			session.close();
			System.out.println(x);
		}
		
	}
	
}



}

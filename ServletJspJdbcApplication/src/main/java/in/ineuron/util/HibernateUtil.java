package in.ineuron.util;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.ineuron.model.StudentBo;

public class HibernateUtil {
	private static SessionFactory sessionFactory=null;
	
	private static Session session = null;

	
	static {
		sessionFactory = new Configuration().configure("in/ineuron/commons/hibernate.cfg.xml")
				.addAnnotatedClass(StudentBo.class).buildSessionFactory();
	}
	
	public static Session getSession() {
		if(session==null) {
			session=sessionFactory.openSession();
		}
		return session;
	}
	
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
		}
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory !=null) {
			sessionFactory.close();
		}
	}
	
	public static void startup() {
		System.out.println("HibernateUtil.startup()....");
	}

}

package domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class HBSession {

	public static void main(String[] args) {


		
		AnnotationConfiguration c=new AnnotationConfiguration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session session=sf.openSession();
		
		User u=new User();
		u.setUid("100");
		u.setUname("krishna");
		u.setPassword("krishna");
		u.setMobile("8500493754");
		u.setEmail("abc@gmail.com");
		
		Transaction ts=session.beginTransaction();
		session.save(u);
		ts.commit();
		session.close();
		sf.close();
		

	}

}

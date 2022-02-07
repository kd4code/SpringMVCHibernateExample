package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Entity.Result;

@Repository
public class myDaoImpl implements myDao {
    @Autowired
	SessionFactory sf;
	
	public void saveResult(Result rt) {
	   Session s=sf.openSession();
	   s.beginTransaction();
	   s.save(rt);
	   s.getTransaction().commit();
	   s.close();
	}


	public void deleteResult(int roll) {
       Session s=sf.openSession();
	   s.beginTransaction();
	   Result r=(Result) s.get(Result.class,roll);
	   s.delete(r);
	   s.getTransaction().commit();
       s.close();   	
	}


	public void updateResult(Result r) {
	   Session s=sf.openSession();
	   s.beginTransaction();
	   s.update(r);
	   s.getTransaction().commit();
	   s.close();		
	}

	public Result getResult(int roll) {
	   Session s=sf.openSession();
	   s.beginTransaction();
	   Result r=(Result) s.get(Result.class,roll);
	   s.getTransaction().commit();
	   s.close();
	   return r;
	}

	public List<Result> getAllResult() {
	   Session s=sf.openSession();
	   s.beginTransaction();
	   Query q=(Query) s.createQuery("from Result");
	   List lt=new ArrayList();
	   lt=q.list();
	   s.getTransaction().commit();
	   s.close();
       return lt ;
	}

}

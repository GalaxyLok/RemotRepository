package online.shixun.project.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.shixun.project.model.UserModel;

@Repository
public class UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return this.sessionFactory.openSession();
	}
	
	public Long save(UserModel entity) {
		return (Long)getCurrentSession().save(entity);
	}
	
	public List<UserModel> messages() {
		Criteria records = getCurrentSession().createCriteria(UserModel.class);
		List<UserModel> list = records.list();
		return list;
	}
}

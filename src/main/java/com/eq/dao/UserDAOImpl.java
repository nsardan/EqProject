package com.eq.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.eq.model.User;

public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(user);
		tx.commit();
		session.close();
	}

	@Override
	public List<User> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> userList = session.createCriteria(User.class).list();
		session.close();
		return userList;
	}

	public User findUserByUserId(int userId) {
		Session session = this.sessionFactory.openSession();
		User user = (User) session.load(User.class, userId);
		session.close();
		return user;

	}

	@Override
	public User findUserByUserName(String userName) {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> user = session.createCriteria(User.class)
				.add(Restrictions.eq("userName", userName)).list();
		session.close();
		return user.get(0);
	}

	@Override
	public void delete(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		//session.delete(user);
		session.close();

	}

}

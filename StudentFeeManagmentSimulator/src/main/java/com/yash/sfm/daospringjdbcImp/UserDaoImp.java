package com.yash.sfm.daospringjdbcImp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.sfm.dao.UserDao;
import com.yash.sfm.model.Student;
import com.yash.sfm.model.User;
import com.yash.sfm.service.UserService;

@Repository
public class UserDaoImp implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public User authenticateUser(User user) {
		System.out.println("In authenticateUser" +user.getEmail() +" and "+user.getPassword());
		
		User userLoggedin = null;
		try{
			Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
			criteria.add(Restrictions.and(Restrictions.eq("email", user.getEmail()), Restrictions.eq("password", user.getPassword())));
			userLoggedin = (User) criteria.uniqueResult();
			System.out.println("userLoggedin is: "+userLoggedin.getEmail());
		}
		catch (HibernateException e) {
			e.printStackTrace();
			//sessionFactory.getCurrentSession().getTransaction().rollback();
		}
		return userLoggedin;
	}
}

package com.yash.sfm.daospringjdbcImp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.sfm.dao.StudentDao;
import com.yash.sfm.model.Student;

@Repository
public class StudentDaoImp implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Student> getStudentList() {
		System.out.println("in getStudentList");
		List<Student> studentList = null;
		
		try{
			Session session = sessionFactory.getCurrentSession();
			Criteria criteria = session.createCriteria(Student.class);//.setProjection(Projections.projectionList().add(Projections.property("email"),"email"));
			studentList = (List<Student>) criteria.list();
			
		}
		catch (Exception ex){
			
		}
		return studentList;
	}

}

package com.yash.sfm.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.sfm.dao.StudentDao;
import com.yash.sfm.model.Student;
import com.yash.sfm.service.StudentService;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public List<Student> getStudentList() {
		return studentDao.getStudentList();
	}

}

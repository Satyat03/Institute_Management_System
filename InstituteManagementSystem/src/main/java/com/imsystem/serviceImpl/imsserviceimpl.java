package com.imsystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imsystem.model.Student;
import com.imsystem.repo.imsrepo;
import com.imsystem.servicei.Imsservicei;
@Service
public class imsserviceimpl implements Imsservicei {

	@Autowired
	imsrepo ri;
	
	
	@Override
	public void savedata(Student s) {
		ri.save(s);
		
	}


	@Override
	public List<Student> alldata() {
		
		return (List<Student>) ri.findAll();
	}


	@Override
	public List<Student> studentdata() {
		ri.findAll();
		return (List<Student>) ri.findAll();
	}

}

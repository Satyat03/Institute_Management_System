package com.imsystem.servicei;

import java.util.List;

import com.imsystem.model.Student;

public interface Imsservicei {

	public void savedata(Student s);

	public List<Student> alldata();

	public List<Student> studentdata();
}

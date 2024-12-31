package com.imsystem.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imsystem.model.Student;

@Repository
public interface imsrepo extends CrudRepository<Student, Integer> {

}

package com.app.sba.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.sba.pojos.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	/*
	 * @Query(value="select * from Student",nativeQuery=true) public
	 * List<Student> getAllStudents();
	 */
}

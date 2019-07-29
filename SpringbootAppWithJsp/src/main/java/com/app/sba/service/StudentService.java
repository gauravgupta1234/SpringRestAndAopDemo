package com.app.sba.service;

import java.util.List;

import com.app.sba.pojos.Student;

public interface StudentService {

	public Student getStudentById(Integer id);

	public void registerStudent(Student student);

	public void deleteStudent(Integer id);

	public void updateStudent(Student s);

	public List<Student> getAllStudent();

}

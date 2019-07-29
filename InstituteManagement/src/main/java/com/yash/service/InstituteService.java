package com.yash.service;

import com.yash.pojos.Student;
import com.yash.pojos.Teacher;

public interface InstituteService {

	public void addStudent(Student student);

	public void addTeacher(Teacher teacher);

	public void upadteEmployeeDetails(Integer empid, String name);

	public void upadteStudentDetails(Integer stuid);

	public void deleteStudent(Integer id);

	public void deleteTeacher(Integer id);

}

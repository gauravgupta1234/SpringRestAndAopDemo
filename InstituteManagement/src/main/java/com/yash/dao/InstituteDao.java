package com.yash.dao;

import java.util.List;

import com.yash.pojos.Student;
import com.yash.pojos.Teacher;

public interface InstituteDao {

	public void addStudent(Student student);

	public void addTeacher(Teacher teacher);

	public void upadteEmployeeDetails(Integer empid, String name);

	public void upadteStudentDetails(Integer stuid);

	public void deleteStudent(Integer id);

	public void deleteTeacher(Integer id);
}

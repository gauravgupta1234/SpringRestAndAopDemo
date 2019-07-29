package com.yash.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.yash.dao.InstituteDao;
import com.yash.pojos.Student;
import com.yash.pojos.Teacher;

public class InstituteServiceImpl implements InstituteService {

	@Autowired
	InstituteDao instituteDao;// = new InstituteDaoImpl();

	@Override
	public void addStudent(Student student) {
		instituteDao.addStudent(student);
	}

	@Override
	public void addTeacher(Teacher teacher) {
		instituteDao.addTeacher(teacher);
	}

	@Override
	public void upadteEmployeeDetails(Integer empid, String name) {
		instituteDao.upadteEmployeeDetails(empid, name);
	}

	@Override
	public void upadteStudentDetails(Integer stuid) {
		instituteDao.upadteStudentDetails(stuid);
	}

	@Override
	public void deleteStudent(Integer id) {
		instituteDao.deleteStudent(id);

	}

	@Override
	public void deleteTeacher(Integer id) {
		instituteDao.deleteTeacher(id);

	}

}

package com.yash.dao;

import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.yash.exceptionhandler.InvalidValueException;
import com.yash.pojos.Student;
import com.yash.pojos.Teacher;

public class InstituteDaoImpl implements InstituteDao {

	StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
			.build();
	Metadata metaData = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
	SessionFactory sFactory = metaData.getSessionFactoryBuilder().build();

	@Override
	public void addStudent(Student student) {
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("addStudent ()---------------BEGIN");
		session.save(student);
		System.out.println("addStudent() --------------END");
		System.out.println("addStudent() --------------DONE");
		tx.commit();
	}

	@Override
	public void addTeacher(Teacher teacher) {
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("addTeacher()---------------BEGIN");
		session.save(teacher);
		System.out.println("addTeacher() --------------END");
		System.out.println("addTeacher() --------------DONE");
		tx.commit();
	}

	@Override
	public void upadteEmployeeDetails(Integer empid, String name) {
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		Teacher updatedteacher = session.get(Teacher.class, empid);
		if (updatedteacher == null)
			throw new InvalidValueException("Teacher id is invalid");
		else {
			updatedteacher.setName(name);
			session.update(updatedteacher);
		}
		System.out.println("upadteEmployeeDetails()---------------BEGIN");
		System.out.println("upadteEmployeeDetails() --------------END");
		System.out.println("upadteEmployeeDetails() --------------DONE");
		tx.commit();
	}

	@Override
	public void upadteStudentDetails(Integer stuid) {
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("upadteStudentDetails()---------------BEGIN");
		System.out.println("upadteStudentDetails() --------------END");
		System.out.println("upadteStudentDetails() --------------DONE");
		tx.commit();
	}

	@Override
	public void deleteStudent(Integer id) {
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student student = session.get(Student.class, id);
		System.out.println("deleteStudent()---------------BEGIN");

		if (student == null)
			throw new InvalidValueException("Invalid student id");
		else {
			session.delete(student);
			System.out.println("deleteStudent() --------------END");
			System.out.println("deleteStudent() --------------DONE");
			tx.commit();
		}
	}

	@Override
	public void deleteTeacher(Integer id) {
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		Teacher teacher = session.get(Teacher.class, id);
		System.out.println("deleteTeacher()---------------BEGIN");
		if (teacher == null)
			throw new InvalidValueException("Invalid student id");
		else {
			session.delete(teacher);
			System.out.println("deleteStudent() --------------END");
			System.out.println("deleteStudent() --------------DONE");
			tx.commit();

		}
	}

}

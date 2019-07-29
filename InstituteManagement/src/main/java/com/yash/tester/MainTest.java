package com.yash.tester;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.configuration.AspectConf;
import com.yash.dao.InstituteDaoImpl;
import com.yash.pojos.Student;
import com.yash.pojos.Teacher;
import com.yash.service.InstituteService;

public class MainTest {

	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata metaData = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sFactory = metaData.getSessionFactoryBuilder().build();
		
		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AspectConf.class);
		//InstituteService service = (InstituteService) ctx.getBean("instituteService");
		/*Student student = new Student(11, "GAURAV", "BAREILLY", "9595710511");
		Teacher teacher = new Teacher(22, "SURAJ", "MUMBAI", "9932393293", 50000);
		// service.addStudent(student);
		System.out.println("------------------------");
		// service.addTeacher(teacher);
		System.out.println("------------------------");
		// service.deleteStudent(5);
		System.out.println("------------------------");
		// service.deleteTeacher(4);
		System.out.println("------------------------");
		// Teacher updateteacher= new Teacher(5, "SURAJ", "DELHI", "1111111112",
		// 50000);
		// service.upadteEmployeeDetails(6, "MANU");
*/
	}
}

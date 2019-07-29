package com.app.sba.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.sba.pojos.Student;
import com.app.sba.repository.StudentRepository;
import com.app.sba.service.StudentService;

@Transactional
@Service
public class StudentSertviceImpl implements StudentService {

	@Autowired
	StudentRepository repo;

	@Override
	public Student getStudentById(Integer id) {

		Student s = repo.findById(id).get();
		return s;
	}

	@Override
	public void registerStudent(Student student) {
		repo.save(student);
	}

	@Override
	public void deleteStudent(Integer id) {

		Student s = repo.findById(id).get();
		repo.delete(s);

	}

	@Override
	public void updateStudent(Student s) {

		repo.save(s);

	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> student = (List<Student>) repo.findAll();

		return student;
	}

}

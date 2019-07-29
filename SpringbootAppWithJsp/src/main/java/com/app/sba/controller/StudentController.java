package com.app.sba.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.sba.dto.Studentdto;
import com.app.sba.pojos.Student;
import com.app.sba.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping(value = "/home")
	public String home() {

		return "home";
	}

	@GetMapping(value = "/register")
	public String add(ModelMap map) {
		System.out.println("inside register get mapping*************************************");
		map.addAttribute("student", new Studentdto(1, "Ex.GAURAV", "EX.DELHI", "EX.9595710511"));
		return "register";
	}

	@PostMapping(value = "/register")
	public String registerStudentWithValidition(@Valid @ModelAttribute Studentdto dt, BindingResult br, ModelMap map) {
		Student st = new Student(1, dt.getName(), dt.getAddress(), dt.getContact());
		if (br.hasErrors()) {
			map.addAttribute("errorMessage", br.getFieldError().getDefaultMessage());
			map.addAttribute("statusCode", HttpStatus.BAD_REQUEST);
			return "error";
		} else {
			service.registerStudent(st);
			return "success";

		}
	}

	@GetMapping(value = "/get/{id}")
	public String getStudentById(@PathVariable Integer id, ModelMap map) {

		map.addAttribute("student", service.getStudentById(id));

		return "studentDetails";
	}

	@GetMapping(value = "/getAllStudent")
	public String getStudentById(ModelMap map) {

		List<Student> student = service.getAllStudent();
		map.addAttribute("studentdetails", student);
		return "studentDetails";
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable Integer id, HttpStatus status) {
		service.deleteStudent(id);
		return new ResponseEntity<>(status.OK);

	}

	@PutMapping(value = "/update/{id}")
	public ResponseEntity<HttpStatus> updateStudent(@PathVariable Integer id, HttpStatus status) {
		Student s = service.getStudentById(id);
		s.setAddress("Bareilly");
		service.registerStudent(s);
		return new ResponseEntity<>(status.OK);

	}

}

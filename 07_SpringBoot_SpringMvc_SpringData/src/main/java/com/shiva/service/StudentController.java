package com.shiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shiva.bindings.Student;

@Controller
public class StudentController {

	@Autowired
	StudentServiceImpl stuImp;

	@RequestMapping(value = { "/", "/studentForm" })
	public String loadForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student";
	}

	@PostMapping(value = "/addStudent")
	public String handleaddStudentBtn(@ModelAttribute("student") Student student, Model model) {

		boolean isSaved = stuImp.saveStudent(student);
		System.out.println("welcome boss");
		String msg = "";

		if (isSaved) {
			msg = "Student Added Successfully";
		} else {
			msg = "Failed to Student Record";
		}

		model.addAttribute("msg", msg);

		return "student";

	}

	@GetMapping("/viewStudents")
	public String viewAllBooks(Model model) {
		List<Student> studentList = stuImp.getAllStudents();
		model.addAttribute("student", studentList);
		return "viewStudents";
	}

	@RequestMapping(value = "/editstu")
	public String edit(@RequestParam int id, Model m) {
		Student stu = stuImp.getEmpById(id);//data will be get from database
		System.out.println(stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSaddd());
		m.addAttribute("student", stu);
		return "stueditform";
	}

	
	  // It updates model object.
	  
	  @RequestMapping(value="/editsave",method = RequestMethod.POST)
	  public String	  editsave(@ModelAttribute("student") Student student,Model model) 
	  {
		  System.out.println("updateing "+student.getSno()+"\t"+student.getSname()+"\t"+student.getSaddd());
		  boolean  isSaved = stuImp.updateStudent(student); 
		  String msg = "";
	  System.out.println("welcome for updating"+isSaved);
	  if (isSaved) 
	  { msg = "Student Updated Successfully"; } 
	  else { msg =
	  "Failed to Updated Record"; }
	  
	  model.addAttribute("msg", msg);
	  
	  return "redirect:/viewStudents";
	  
	  }
	 
	  @RequestMapping(value = "/deletestu")
		public String delete(@RequestParam int id, Model m) {
		  System.out.println("Welcome boss to delete"+id);
			stuImp.deleteStudent(id);

			return "redirect:/viewStudents";
		}

	  
	  
}

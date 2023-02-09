package Viikkoharjoitukset2.HandlingLists.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Viikkoharjoitukset2.HandlingLists.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("/helloStudents")
	public String showStudents(Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Milla", "Mallikas"));
		students.add(new Student("Urpo", "Petteri"));
		students.add(new Student("Kauko", "Linja"));
		model.addAttribute("students", students);
		return "studentlist";
	}

}

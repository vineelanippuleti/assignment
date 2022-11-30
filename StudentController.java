package com.example.StudentMarks.StudentController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.StudentMarks.domain.Student;
@Controller
public class StudentController {
    
	@GetMapping("/index")
	public String viewForm(Model model)
	{
		model.addAttribute("student",new Student());
		return "index";
	}
	@PostMapping("/re")
	public String processForm(@ModelAttribute Student student,BindingResult result,Model model)
	{
		model.addAttribute("student",student);
		return "re";
		
	}
}

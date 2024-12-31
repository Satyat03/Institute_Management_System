package com.imsystem.imsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imsystem.model.Student;
import com.imsystem.servicei.Imsservicei;

@Controller
public class imsController {

	public void m1()
	{
		
	}
	
	@Autowired
	Imsservicei ssi;

	@RequestMapping("/")
	public String welcome() {
		return "welcome";

	}

	@RequestMapping("/enterdata")
	public String enterdata() {
		return "enterdata";

	}

	@RequestMapping("/showdata")
	public String showdata() {
		return "showdata";

	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute Student s, Model m) {
		ssi.savedata(s);
		return "welcome";
	}
	
	@RequestMapping("/student")
	public String studata(Model m)
	{
		List<Student> list=ssi.studentdata();
		m.addAttribute("d",list);
		return "student";
		
	}
	
	@RequestMapping("/batch")
	public String batchdata(Model m)
	{
		List<Student> list=ssi.studentdata();
		m.addAttribute("d",list);
		return "batch";
		
	}
	
	@RequestMapping("/faculty")
	public String facultydata(Model m)
	{
		List<Student> list=ssi.studentdata();
		m.addAttribute("d",list);
		return "faculty";
		
	}
	
	@RequestMapping("/course")
	public String coursedata(Model m)
	{
		List<Student> list=ssi.studentdata();
		m.addAttribute("d",list);
		return "course";
		
	}
	
	
	@RequestMapping("/alldata")
	public String alldata1( Model m)
	{
		
		List<Student> list=ssi.alldata();
		m.addAttribute("d",list);
		return "data";
		
	}
	
	
	
}

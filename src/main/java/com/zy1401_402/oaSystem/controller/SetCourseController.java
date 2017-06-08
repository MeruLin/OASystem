package com.zy1401_402.oaSystem.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SetCourseController {
    
	@RequestMapping("/setCourse")
	public String SetCourse() throws Exception{
		Subject subject = SecurityUtils.getSubject();
		if(subject.isPermitted("set_schedule")){
			System.out.println(subject.getSession().getAttribute("person_id"));
			return "set_schedule";
		}else{
			throw new Exception();
		}
	}
}

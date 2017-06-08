package com.zy1401_402.oaSystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zy1401_402.oaSystem.dao.coursesMapper;
import com.zy1401_402.oaSystem.dao.personMapper;
import com.zy1401_402.oaSystem.entity.courses;
import com.zy1401_402.oaSystem.entity.person;
import com.zy1401_402.oaSystem.entity.schedule;
import com.zy1401_402.oaSystem.dao.scheduleMapper;

@Controller
public class SetCourseController {
	@Autowired
	private personMapper personMapper;
	private coursesMapper coursesMapper;
	private scheduleMapper scheduleMapper;
    
	@RequestMapping("/setCourse")
	public String SetCourse(schedule sch) throws Exception{
		Subject subject = SecurityUtils.getSubject();
		if(subject.isPermitted("set_course")){
			//向输入的课程中添加添课者信息
			String person_id = (String)subject.getSession().getAttribute("person_id");
			person per = personMapper.selectByPrimaryKey(person_id);
			sch.setPersonId(person_id);
			sch.setPersonName(per.getPersonName());
			//查找是否存在输入的课程，没有则跳转到课程不存在页面
			if(coursesMapper.selectByPrimaryKey(sch.getCourseId())==null){
				return "course_not_exist";
			}else{
				scheduleMapper.insert(sch);
				return "success";
			}
		}else{
			//如果没有添课权限
			return "not_allow";
		}
	}
	
	@ResponseBody  
	@RequestMapping("/get_person_courses")
	public List<courses> getPersonCourses(){
		Subject subject = SecurityUtils.getSubject();
		String person_id = (String)subject.getSession().getAttribute("person_id");
		List<courses> list = new ArrayList<courses>();
		//由于mapper中查询方法没实现，因此暂时放置
		return null;
	}
	
}

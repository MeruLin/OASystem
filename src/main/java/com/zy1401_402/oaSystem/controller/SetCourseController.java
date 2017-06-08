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
			//������Ŀγ�������������Ϣ
			String person_id = (String)subject.getSession().getAttribute("person_id");
			person per = personMapper.selectByPrimaryKey(person_id);
			sch.setPersonId(person_id);
			sch.setPersonName(per.getPersonName());
			//�����Ƿ��������Ŀγ̣�û������ת���γ̲�����ҳ��
			if(coursesMapper.selectByPrimaryKey(sch.getCourseId())==null){
				return "course_not_exist";
			}else{
				scheduleMapper.insert(sch);
				return "success";
			}
		}else{
			//���û�����Ȩ��
			return "not_allow";
		}
	}
	
	@ResponseBody  
	@RequestMapping("/get_person_courses")
	public List<courses> getPersonCourses(){
		Subject subject = SecurityUtils.getSubject();
		String person_id = (String)subject.getSession().getAttribute("person_id");
		List<courses> list = new ArrayList<courses>();
		//����mapper�в�ѯ����ûʵ�֣������ʱ����
		return null;
	}
	
}

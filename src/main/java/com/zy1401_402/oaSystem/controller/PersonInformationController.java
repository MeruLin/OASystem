package com.zy1401_402.oaSystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zy1401_402.oaSystem.dao.personMapper;
import com.zy1401_402.oaSystem.entity.person;

@Controller
public class PersonInformationController {

	@Autowired
	private personMapper personMapper;
	
	@ResponseBody  
	@RequestMapping("/personinfo.do")
	public List<person> personInformation(Model model){
		List<person> list = new ArrayList<person>();
		Subject subject = SecurityUtils.getSubject();
		String personId = "";
		if(subject.isPermitted("set_tea_info")){
			personId = (String)subject.getSession().getAttribute("person_id");
			person per = personMapper.selectByPrimaryKey(personId);
			System.out.println(personId);
			list.add(per);
			System.out.println(per.getPersonName());
			return list;
		}
		else{
			return null;
		}
	}
	
	@RequestMapping("/set")
	public String setingInfo(){
		return "setinfo";
	}
	
	@RequestMapping("/set_personinfo")
	public String setPersonInfo(person set_person){
		Subject subject = SecurityUtils.getSubject();
		String personId = "";
		if(subject.isPermitted("set_tea_info")){
			personId = (String)subject.getSession().getAttribute("person_id");
			person per = personMapper.selectByPrimaryKey(personId);
			per.setPersonEmail(set_person.getPersonEmail());
			per.setPersonPhone(set_person.getPersonPhone());
			personMapper.updateByPrimaryKeySelective(per);
		}
		else{
			return null;
		}
		return "success";
	}
	
}

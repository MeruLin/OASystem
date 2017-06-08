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

import com.zy1401_402.oaSystem.dao.leave_applyMapper;
import com.zy1401_402.oaSystem.dao.personMapper;
import com.zy1401_402.oaSystem.entity.leave_apply;
import com.zy1401_402.oaSystem.entity.person;

@Controller
public class AskForLeaveController {
	@Autowired
	private leave_applyMapper leave_applyMapper;
	private personMapper personMapper;
	
	@RequestMapping("/apply_leave")
	public String applyLeave(leave_apply apply){
		Subject subject = SecurityUtils.getSubject();
		String person_id = (String)subject.getSession().getAttribute("person_id");
		person per = personMapper.selectByPrimaryKey(person_id);
		apply.setPersonId(per.getPersonId());
		apply.setPersonName(per.getPersonName());
		leave_applyMapper.insert(apply);
		return "success";
	}

}

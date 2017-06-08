package com.zy1401_402.oaSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy1401_402.oaSystem.dao.personMapper;
import com.zy1401_402.oaSystem.entity.person;

@Service("userService")
public class personService{
	@Autowired
	private personMapper personMapper;
	
	public person queryPersonById(String id){
		return personMapper.selectByPrimaryKey(id);
	}
}
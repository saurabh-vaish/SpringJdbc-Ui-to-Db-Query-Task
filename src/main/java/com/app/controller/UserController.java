package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Employee;
import com.app.model.User;

@Controller
public class UserController {

	@Autowired
	private JdbcTemplate jt;
	
	@RequestMapping("/show")
	public String showuserRegPage()
	{
		return "userReg";
	}
	
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	public String showuserRegPage(@ModelAttribute User user, ModelMap map)
	{
		
		String query = user.getUserQuery();
		
		List<Employee> list = jt.query(query,(rs,row)->new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
		
		list.forEach(System.out::println);
		
		map.addAttribute("data", list);
		
		return "userReg";
	}
}

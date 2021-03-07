package com.shanghai.ssm.handler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shanghai.ssm.beans.Employee;
import com.shanghai.ssm.beans.User;
import com.shanghai.ssm.service.EmployeeService;

@Controller
public class EmployeeHandler {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/emps",method=RequestMethod.GET)
	public String listEmps(Map<String,Object> maps){
		
		List<Employee> emps = employeeService.selectAllEmps();
		maps.put("emps",emps);
		System.out.println("handler running...");
		return "list";
	}	
	
	@RequestMapping(value="/del/{id}")
	public String deldata(@PathVariable("id") Integer id){
		
		System.out.println("ɾ������"+id);
		employeeService.delData(id);
		return "list";
	}
	
	@RequestMapping(value="/upd/{id}",method=RequestMethod.GET)
	public String upddata(@PathVariable("id") Integer id){
		
		System.out.println("��������"+id);
		employeeService.updData(id);
		
		return "list";
	}
	
	
	@RequestMapping(value="/testPojo")
	public String insertdata(User user){
		
		System.out.println("��������"+user);
		employeeService.insertdata(user);
		
		return "list";
	}
	
	 
}

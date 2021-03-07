package com.shanghai.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shanghai.ssm.beans.Employee;
import com.shanghai.ssm.beans.User;
import com.shanghai.ssm.mapper.EmployeeMapper;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> selectAllEmps(){
		
		return employeeMapper.selectAllEmps();
	}
	
	public void delData(Integer id){
		System.out.println("进入service");
		employeeMapper.delData(id);
		
		System.out.println("service层删除数据!");
	}
	
	
	public void updData(Integer id){
		System.out.println("进入service");
		employeeMapper.updData(id);
		
		System.out.println("service层插入数据!");
		
	}
	
	public void insertdata(User user){
		System.out.println("进入service");
		employeeMapper.insertData(user);
		
		System.out.println("service层插入数据!");
		
	}
}

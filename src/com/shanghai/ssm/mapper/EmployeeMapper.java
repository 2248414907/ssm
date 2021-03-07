package com.shanghai.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shanghai.ssm.beans.Employee;
import com.shanghai.ssm.beans.User;

public interface EmployeeMapper {
	
	public List<Employee> selectAllEmps();
	
	public void delData(@Param("id") Integer id);
	
	public void updData(@Param("id") Integer id);
	
	public void insertData(User user);

}

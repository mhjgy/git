package com.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.mapper.DepartmentMapper;
import com.springcloud.pojo.Department;

@Service
public class DepService {
     
	  @Autowired
	   private DepartmentMapper departmentMapper;
	  
	  
	  public List<Department> selectAll(){
		  return departmentMapper.selectAll();
	  }
	  
	  
	  public Department selectById(Integer id){
		  return departmentMapper.selectById(id);
	  }
}

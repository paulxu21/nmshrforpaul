package com.xhp.dao;

import com.xhp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xuhaipeng on 2017/1/9.
 */
public interface EmployeeDao extends JpaRepository<Employee,Integer>{
}
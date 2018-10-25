package com.atguigu.mybatis;

import com.atguigu.mybatis.bean.Employee;

/**
 * @author lhd
 */
public interface EmployeeMapperInter {

    public Employee getEmployeeById(Integer id);

    public void addEmp(Employee employee);

}

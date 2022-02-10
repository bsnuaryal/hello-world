package com.ems.dao;
import com.ems.pojo.EmployeeInfo;
import java.util.List;

public interface EmpDAO {

	void addEmployee();
	List<EmployeeInfo> viewAllEmployees();
	EmployeeInfo viewEmployee(int eid);
	void deleteEmployee(int eid);
	void updateEmployee(int eid);
}

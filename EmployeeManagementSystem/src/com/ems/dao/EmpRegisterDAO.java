package com.ems.dao;

public interface EmpRegisterDAO {

	public void registerEmp();
	public boolean verifyEmp(int id, String pass);
}

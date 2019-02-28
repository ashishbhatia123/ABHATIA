package com.cg.hr.core.services;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.daos.EmployeeDaoImpl;
import com.cg.hr.core.daos.IEmployeeDao;
import com.cg.hr.core.exceptions.EmpException;

public class EmployeeServicesImpl implements IEmployeeServices {
	private IEmployeeDao dao;

	public EmployeeServicesImpl() {
		super();
		dao= new EmployeeDaoImpl();
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() throws EmpException {
		// TODO Auto-generated method stub
		return dao.fetchAllEmp();
	}
	
	
	

}

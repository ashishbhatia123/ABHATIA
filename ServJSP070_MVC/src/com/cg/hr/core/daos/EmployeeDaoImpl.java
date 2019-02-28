package com.cg.hr.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;
import com.cg.hr.core.util.JPAUtil;

public class EmployeeDaoImpl implements IEmployeeDao{

	EntityManager em= null;
	EntityTransaction entityTran  = null;
	
	public EmployeeDaoImpl() {
		
		em= JPAUtil.getEntityManager();
		entityTran = em.getTransaction();
	}
/*
	@Override
	public Employee addEmployee(Employee emp) {
		
		entityTran.begin();
		em.persist(emp);   // persist is used for insert 
		entityTran.commit();
		return emp;
	}*/

	@Override
	public ArrayList<Employee> fetchAllEmp() throws EmpException {
		try
		{// TODO Auto-generated method stub
		String selAllQry ="select emps from Employee emps"; //first name must be equal to second i.e emps
		TypedQuery<Employee> tq = em.createQuery(selAllQry, Employee.class);
		ArrayList<Employee> empList = (ArrayList<Employee>) tq.getResultList();
		return empList;
	}
		catch(Exception e)
		{
			throw new EmpException("Something went wrong in fetchAll()");
		}
	}
	

	/*@Override
	public Employee deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmpId(empId);
		em.remove(e1);
		 // not delete because e1 is not in manage stateb it is in start stae
		Employee e1 = em.find(Employee.class, empId);
		entityTran.begin();
		e1.setEmpId(empId);
		em.remove(e1);
		entityTran.commit();
		return e1;
	}

	@Override
	public Employee getEmpbyEid(int empId) {
		// TODO Auto-generated method stub
		Employee ee =em.find(Employee.class, empId); // select * from employee where empId =?
		return ee;
	
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		Employee ee=em.find(Employee.class, empId);
		ee.setEmpName(newName);
		ee.setEmpSal(newSal);
		entityTran.begin();
		em.merge(ee);
		entityTran.commit();
		
		return ee;
	}
	*/

}

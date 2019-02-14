package com.cig.eis.service;
import com.cg.cis.bean.*;

	
interface EmployeeService
{
	public abstract void setEmployeeDetails(Employee obj);
	public abstract void insuaranceScheme();
	public abstract Employee getEmployeeDetails();
	
}
public class Service  implements EmployeeService
{
	Employee obj;
	Service obj3 = new Service();
	public void setEmployeeDetails(Employee obj)
	{
		this.obj=obj;
	insuaranceScheme();
	}
	@Override
	public void insuaranceScheme() {
		// TODO Auto-generated method stub
		if(obj.getSalary()>5000 && obj.getSalary()<20000 || obj.getDesignation().equals("System Accociate"))
		{
			obj.setInsuranceScheme("c");
		}
		else if(obj.getSalary()>20000 && obj.getSalary()<40000 || obj.getDesignation().equals("programmer"))
		{
			obj.setInsuranceScheme("b");
		}
		else if(obj.getSalary()>=40000  || obj.getDesignation().equals("Manager"))
		{
			obj.setInsuranceScheme("a");
		}
		else if(obj.getSalary()<5000 || obj.getDesignation().equals("clerk"))
		{
			obj.setInsuranceScheme("no scheme");
		}
		
	}
	@Override
	public Employee getEmployeeDetails() {
		// TODO Auto-generated method stub
		return(obj);
	}
	
	
}

 
package com.inetsolv.hibernate;

import java.util.ArrayList;

public class DisplayData {

	public static void main(String[] args) throws Exception {
		RetrieveData retData=new RetrieveData();
		ArrayList< Employee> empData=retData.getData();
		
		for(Employee emp:empData)
		{
			System.out.println(emp.getEno()+" "+emp.getEname()+" "+emp.getSalary());
		}

	}
}
package com.inetsolv.hibernate;

import java.sql.*;
import java.util.ArrayList;

public class RetrieveData {
	public ArrayList <Employee> getData() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM EMP_TBL");
		ArrayList<Employee> empList=new ArrayList<Employee>();
		
		while(rs.next())
		{
			Employee emp=new Employee();
			emp.setEid(rs.getInt("eno"));
			emp.setEname(rs.getString("ename"));
			emp.setSalary(rs.getDouble("salary"));
			empList.add(emp);
		}
		conn.close();
		return empList;
	}
}

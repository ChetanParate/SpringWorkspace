package com.nt.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

public class SelectBean implements Select {
	
	//
	DataSource ds;
	public void setDs(DataSource ds) {
	
		this.ds=ds;
	}
	
	public String fetchName(int eno) {
		try {
		Connection con = ds.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select ename from emp where eno ="+eno);
		String name =null;
		if(rs.next()){
			name = rs.getString(1);
		}
		rs.close();
		st.close();
		con.close();
		return name;
		}
		catch(Exception e) {
			return null;
		}		
	}
	public int fetchSalary(int eno) {
		
		try {
			Connection con = ds.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select sal from emp where eno ="+eno);
			int bsal =0;
			if(rs.next()){
				bsal = rs.getInt(1);
			}
			rs.close();
			st.close();
			con.close();
			return bsal;
			}
			catch(Exception e) {
				return 0;
			}	
	}//business logic	
}//class

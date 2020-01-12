package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class LoanDAO {
	
	private static final String INSERT_QRY ="INSERT INTO CUSTOMER_LOANINFO VALUES(?,?,?,?)";
	private DataSource ds;
	
	public void setDs(DataSource ds) {
	this.ds = ds;	
	}
	
	public int insert(CustomerBO cbo) {
		int result = 0;
		Connection con = null;
		PreparedStatement pst = null;
		try{
			con = ds.getConnection();
			pst = con.prepareStatement(INSERT_QRY);
			pst.setInt(1, cbo.getCno());
			pst.setString(2, cbo.getCname());
			pst.setFloat(3, cbo.getPamt());
			pst.setFloat(4, cbo.getIntramt());
			
			result = pst.executeUpdate();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try{
				if(pst!=null)
					pst.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try{
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		return result;
	}
}

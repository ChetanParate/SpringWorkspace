package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import com.nt.bo.StudentBO;

public class StudentDAO {
	private final  static String STUD_UPDATE_QRY="update student set sadd=? where rollno=?";
	private final  static String FIND_STUD_BY_ADDRS="select rollno,sname,sadd from student where sadd=?";
	
	StudentUpdator stupdator;
	StudentSelector stselector;

	public StudentDAO(DataSource ds) {
		stupdator=new StudentUpdator(ds);
		stselector=new StudentSelector(ds);
		
	}
	
	public int updateStudent(int no,String address){
		int cnt= stupdator.updateStudDetails(no, address);
		 return cnt;
		
	}
	
	public List<StudentBO> findStudentsByAddress(String address){
		  return stselector.findByAddress(address);
	}
	
	private final class StudentUpdator extends SqlUpdate{
		
		   public StudentUpdator(DataSource ds){
			   //call super class constructor
			   super(ds,STUD_UPDATE_QRY);
			   
			   // Declare params
			   declareParameter(new SqlParameter(Types.VARCHAR));
			   declareParameter(new SqlParameter(Types.INTEGER));
			   
			   //make DB s/w to compile SQL Query
			   compile();
			   
		   }
		
		   public int updateStudDetails(int no,String address){
			   int cnt=super.update(address,no);
			   return cnt;
			   
		   }
		
	}//inner class
	
	private final class StudentSelector extends MappingSqlQuery<StudentBO>
	{
           public StudentSelector(DataSource ds){
        	   //call super class constructor
        	   super(ds,FIND_STUD_BY_ADDRS);
        	   
        	   declareParameter(new SqlParameter(Types.VARCHAR));
        	   
        	   compile();
           }
		
		
		@Override
		protected StudentBO mapRow(ResultSet rs, int  index)
				throws SQLException {
			System.out.println("Stu"
					+ "dentSelect:mapRow(-,-)");
			
			return new StudentBO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getFloat(5));
		}
		
		public List<StudentBO> findByAddress(String addrs){
			System.out.println("findByAdress(-)");
			   List<StudentBO> list=super.execute(addrs);
			   return list;
			
		}
		
		
	}
	
	

}

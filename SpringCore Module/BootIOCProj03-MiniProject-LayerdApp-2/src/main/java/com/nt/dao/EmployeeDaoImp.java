package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDao")
public class EmployeeDaoImp implements IEmployeeDao {
	//query to be executed in db
private static final String GET_EMP_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY EMPNO";
	
//getting datasource object for connection pool bydault hikaricp connection pool through autoconfiguration
	@Autowired
	private DataSource ds;
	
	
	@SuppressWarnings("null")
	@Override
	public List<Employee> showAllEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list = new ArrayList<>();
		try(Connection con=ds.getConnection();
			PreparedStatement pstmt=con.prepareStatement(GET_EMP_BY_DESGS);	){
			//set value to query parameters
			pstmt.setString(1, desg1);
			pstmt.setString(2, desg2);
			pstmt.setString(3, desg3);
			try(ResultSet rs=pstmt.executeQuery()){
				//copy rs data to employee feild 
				
				while(rs.next()) {
					Employee emp=new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getInt(4));
					emp.setDeptno(rs.getInt(5));
					
					list.add(emp);
				}
			}catch(Exception e) {
				e.printStackTrace();
				throw e;
			}//2nd try catch
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}//1st try catch
		return list;
	}//method

}//class

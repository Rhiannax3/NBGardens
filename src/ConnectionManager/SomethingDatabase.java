package ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;

import com.sun.rowset.CachedRowSetImpl;



public class SomethingDatabase {
	Connection connection     = null;
	Statement statement 	  = null;
	ResultSet resultSet 	  = null;
	CachedRowSet cachedRowSet = null;
	
	OracleConnector oracleConnector = new OracleConnector();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String loginCheck(String USR, String PWD){
		conn = plsqlconnector.oracleDbConnect(USR, PWD);
		String role = null;
		if (conn != null){
			String sql = "SELECT role FROM system.employee WHERE employee.username = '" + USR.toLowerCase() + "'";
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()){
					role = rs.getString("role");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		plsqlconnector.oracleDbDisconnect(conn);
		conn = null;
		return role;
	}
	public CachedRowSet dbQuery(String query){	
		conn = plsqlconnector.oracleDbConnect(login.getUser(), login.getPassword());
		try{
			crs = new CachedRowSetImpl();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			crs.populate(rs);
		} catch (SQLException e){
			e.printStackTrace();
		}
		plsqlconnector.oracleDbDisconnect(conn);
		conn = null;
		return crs;
	}
	
	public void dbUpdate(String query){
		conn = plsqlconnector.oracleDbConnect(login.getUser(), login.getPassword());
		try{
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

	public void logout() {
		login.setUser(null);
		login.setPassword(null);
		return;		
	}
}

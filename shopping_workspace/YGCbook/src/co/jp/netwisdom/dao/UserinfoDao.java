package co.jp.netwisdom.dao;

import java.sql.SQLException;

import cn.key.dbManager.JdbcTemplate;

public class UserinfoDao {
	
	private JdbcTemplate jdbcObj = new JdbcTemplate();
	
	
	public boolean insertUserinfo(String username,String password,String sex,String major,String intro){
		int row = 0;
		String sql = "insert into userinfo (username,password,sex,major,intro) values (?,?,?,?,?)";
		Object[] objV = {username,password,sex,major,intro};
		
		try{
			row = jdbcObj.updata(sql, objV);
		}catch(SQLException e){
			
		}catch(ClassNotFoundException e){
			
		}
		
		return (row == 1);
		
	
		//jdbcObj.updata(sql, jdbcObj);
	}

	
}

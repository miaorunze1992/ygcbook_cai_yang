package co.jp.netwisdom.dao;

import java.sql.SQLException;

import cn.key.dbManager.JdbcTemplate;
import co.jp.netwisdom.entity.Userinfo;

public class UserinfoDao {
	
	private JdbcTemplate jdbcObj = new JdbcTemplate();
	
	
	public boolean insertUserinfo(Userinfo userinfo){
		int row = 0;
		String sql = "insert into userinfo (username,password,sex,major,intro) values (?,?,?,?,?)";
		Object[] objV = userinfo.getObjArray();
		try{
			row = jdbcObj.updata(sql, objV);
		}catch(SQLException e){
			
		}catch(ClassNotFoundException e){
			
		}
		return (row == 1);
	}

	
}

package co.jp.netwisdom.dao;

import java.sql.SQLException;

import cn.key.dbManager.JdbcTemplate;

public class HobbyDao {

	private JdbcTemplate jdbcObj = new JdbcTemplate();
	
	// insert hobby表
	public boolean insertHobby(String username, String[] hobbyArray){
		
		int row = 0;
		String sql = "insert into hobby (username, hobby) values (?,?)";
		try{
			for (String hobbyLoop : hobbyArray) {
				Object[] values = { username, hobbyLoop };
				row = row + jdbcObj.updata(sql, values);
			}
		}catch(SQLException e){
			// message
		}catch(ClassNotFoundException e){
			// message
		}
		return row == hobbyArray.length;
	}
}

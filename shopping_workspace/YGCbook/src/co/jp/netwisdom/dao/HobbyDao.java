package co.jp.netwisdom.dao;

import java.sql.SQLException;

import cn.key.dbManager.JdbcTemplate;
import co.jp.netwisdom.entity.Hobby;

public class HobbyDao {

	private JdbcTemplate jdbcObj = new JdbcTemplate();
	
	// insert hobby表
	public boolean insertHobby(Hobby hobby){
		
		int row = 0;
		String sql = "insert into hobby (username, hobby) values (?,?)";
		try{
			for (String hobbyLoop : hobby.getHobbyArray()) {
				Object[] values = { hobby.getUsername(), hobbyLoop };
				row = row + jdbcObj.updata(sql, values);
			}
		}catch(SQLException e){
			// message
		}catch(ClassNotFoundException e){
			// message
		}
		return row == hobby.getHobbyArray().length;
	}
}

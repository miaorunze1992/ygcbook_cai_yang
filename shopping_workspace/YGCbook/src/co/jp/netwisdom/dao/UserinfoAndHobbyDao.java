package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.key.dbManager.JdbcTemplate;
import co.jp.netwisdom.entity.UserinfoAndHobby;
import co.jp.netwisdom.mapping.UserinfoAndHobbyMapping;

public class UserinfoAndHobbyDao {
	
	private JdbcTemplate jdbcObj = new JdbcTemplate();
	
	public List<UserinfoAndHobby> searchUAH(String username,String sex,String major){
		
		String sql = "select ui.username,ui.sex,group_concat(hb.hobby) hobby,"+
		"ui.major,ui.intro from userinfo ui left join hobby hb on ui.username = hb.username"+
		" where 1=1 ";
		
		if(!username.equals("")){
			sql += "and ui.username = '" +username +"'";
		}
		
		if(sex != null){
			sql += "and sex = '" +sex +"'";
		}
		
		if(!major.equals("")){
			sql += "and major = '" +major +"'";
		}
		
		sql += " group by ui.username ";
		
		
		List<UserinfoAndHobby> list = new ArrayList<UserinfoAndHobby>();
		
		
		try {
			list = jdbcObj.selete(sql, new UserinfoAndHobbyMapping());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	

}

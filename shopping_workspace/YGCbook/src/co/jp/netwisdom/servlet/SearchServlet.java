package co.jp.netwisdom.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.UserinfoAndHobbyDao;
import co.jp.netwisdom.entity.UserinfoAndHobby;

public class SearchServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String sex = req.getParameter("sex");
		String major = req.getParameter("major");
		
		UserinfoAndHobbyDao dao = new UserinfoAndHobbyDao();
		
		List<UserinfoAndHobby> list = dao.searchUAH(username, sex, major);
		
		Map<String,String> map = new HashMap<>();
		map.put("username", username);
		map.put("sex", sex);
		map.put("major", major);
		
		req.setAttribute("rsMap", map);
		req.setAttribute("dataList", list);
		
		req.getRequestDispatcher("/userSearch.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	

}

package co.jp.netwisdom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.UserinfoDao;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("走进来了");
		// 接收前台传入值
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sex = req.getParameter("sex");
		String major = req.getParameter("major");
		String intro = req.getParameter("intro");
		
		String[] hobby = req.getParameterValues("hobby");
		
		UserinfoDao dao = new UserinfoDao();
		
		boolean rs = dao.insertUserinfo(username, password, sex, major, intro);
		
		if(rs){
			System.out.println("插入成功");
		}else{
			System.out.println("插入shibai");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}

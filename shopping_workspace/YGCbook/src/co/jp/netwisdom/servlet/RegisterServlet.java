package co.jp.netwisdom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.HobbyDao;
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
		
		HobbyDao daoH = new HobbyDao();
		
		boolean rsH = daoH.insertHobby(username, hobby);
		
		if(rs && rsH){
			// request方式
			req.getRequestDispatcher("/registerSuccess.jsp").forward(req, resp);;
		}else{
			// response方式          
			resp.sendRedirect("/YGCbook/registerFail.jsp");
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}

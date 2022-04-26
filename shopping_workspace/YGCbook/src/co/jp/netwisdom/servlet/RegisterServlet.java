package co.jp.netwisdom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.HobbyDao;
import co.jp.netwisdom.dao.UserinfoDao;
import co.jp.netwisdom.entity.Hobby;
import co.jp.netwisdom.entity.Userinfo;

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
		
		Userinfo userinfo = new Userinfo(username,password,sex,major,intro);

		String[] hobby = req.getParameterValues("hobby");
		UserinfoDao dao = new UserinfoDao();
		boolean rs = dao.insertUserinfo(userinfo);
		
		HobbyDao daoH = new HobbyDao();
		Hobby hobbyEntity = new Hobby(username, null, hobby);
		boolean rsH = daoH.insertHobby(hobbyEntity);
		
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

package com.poscoict.guestbook.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poscoict.guestbook.dao.GuestbookDao;
import com.poscoict.guestbook.vo.GuestbookVo;
import com.poscoict.web.mvc.Action;
import com.poscoict.web.util.MvcUtil;

public class AddAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String message = request.getParameter("message");

		System.out.println("name : " + name);
		
		GuestbookDao dao = new GuestbookDao();
		GuestbookVo vo = new GuestbookVo();

		vo.setName(name);
		vo.setPassword(password);
		vo.setMessage(message);
		dao.insert(vo);
		
		MvcUtil.redirect(request.getContextPath() + "/gb", request, response);
	}
}

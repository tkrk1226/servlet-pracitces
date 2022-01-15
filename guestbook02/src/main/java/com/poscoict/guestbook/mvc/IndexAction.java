package com.poscoict.guestbook.mvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poscoict.guestbook.dao.GuestbookDao;
import com.poscoict.guestbook.vo.GuestbookVo;
import com.poscoict.web.mvc.Action;
import com.poscoict.web.util.MvcUtil;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GuestbookDao dao = new GuestbookDao();
		List<GuestbookVo> list = dao.findAll();
		Long count = dao.cntAll();
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		MvcUtil.forward("index", request, response);
	}

}

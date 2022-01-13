package com.poscoict.guestbook.dao.test;

import java.util.List;

import com.poscoict.guestbook.dao.GuestbookDao;
import com.poscoict.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
//		testFindAll();
//		testInsert();
//		testDelete();
//		testCntAll();
//		testReplace();
	}

	private static void testReplace() {
		String strTest = "아이고 즐거워~\n오늘도 내일도 신나는 하루~\n보람찬 하루가 시작된다!!";
		System.out.println(strTest.replace("\n", "<br>"));
	}

	private static void testCntAll() {
		Long cnt = new GuestbookDao().cntAll();
		System.out.println(cnt);
	}

	private static void testFindAll() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void testInsert() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("정의진");
		vo.setPassword("1234");
		vo.setMessage("하히후헤호\n신난다~");
		
		boolean result = new GuestbookDao().insert(vo);
		System.out.println(result ? "success" : "fail");
	}

	
	private static void testDelete() {
		Long no = 3L;
		String password = "1234";
		boolean result = new GuestbookDao().delete(no, password);
		System.out.println(result ? "success" : "fail");
	}



}

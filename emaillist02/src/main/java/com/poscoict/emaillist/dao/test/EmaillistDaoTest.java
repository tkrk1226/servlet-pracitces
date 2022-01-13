package com.poscoict.emaillist.dao.test;

import java.util.List;

import com.poscoict.emaillist.dao.EmaillistDao;
import com.poscoict.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {		
//		testInsert();
		testFindAll();
	}

//	로직부터 짜는 중...
	private static void testInsert() {
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstName("정");
		vo.setLastName("의진");
		vo.setEmail("tkrk1226@naver.com");
		boolean result = new EmaillistDao().insert(vo); // insert를 만드니까 그 전에 뭐가 필요한지 알게됨
		System.out.println(result ? "success" : "fail");
	}

	private static void testFindAll() {
		List<EmaillistVo> list = new EmaillistDao().findAll();
		for(EmaillistVo vo : list ) {
			System.out.println(vo);
		}
		
		// 두 인자 값이 같다라고 단언 : 같지 않으면 그냥 실패라고 단정짓는다.
		// 테스트 케이스들의 결과가 모두 정상이 나올 때까지...
//		assertEquals(2, list.size());
	}
}
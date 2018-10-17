package study.spring.myschool;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import study.spring.myschool.model.ProfessorDepartment;

/** JUnit에 의해서 실행될 클래스임을 명시함 */
//import org.junit.runner.RunWith;
@RunWith(SpringJUnit4ClassRunner.class)

/** 스프링이 로딩될 수 있도록 경로 설정 */
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ProfessorSelectItemTest {
	
	@Autowired
	private SqlSession sqlSession; // 객체주입
	
	@Test
	public void testFactory() {
		
		// 조회할 데이터의 조건값 설정
		// -> import study.spring.myschool.model.ProfessorDepartment;
		ProfessorDepartment professor = new ProfessorDepartment();
		professor.setProfno(9977);
		
		// 조회결과가 저장될 객체
		ProfessorDepartment result = null;
		
		try {
			result = sqlSession.selectOne("ProfessorJoinMapper.selectProfessorJoinItem", professor);
			if (result == null) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			System.out.println("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println("데이터 조회에 실패했습니다.");
		}
		
		System.out.println(result.toString());
	}

}

package study.spring.myschool.service;

import java.util.List;
import study.spring.myschool.model.ProfessorDepartment;

/** 교수 관리 기능을 제공하기 위한 Service 계층. */
public interface ProfessorJoinService {
	
	public ProfessorDepartment getProfessorJoinItem(ProfessorDepartment professor) 
			throws Exception;
	
	public List<ProfessorDepartment> getProfessorJoinList(ProfessorDepartment professor) 
			throws Exception;
	
	
	public int getProfessorCount(ProfessorDepartment professor) throws Exception;
}



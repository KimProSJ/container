package study.spring.myschool.service;

import java.util.List;

import study.spring.myschool.model.Professor;

/** 교수 관리 기능을 제공하기 위한 Service 계층. */
public interface ProfessorService {
	
	public void addProfessor(Professor professor) throws Exception;

	public void editProfessor(Professor professor) throws Exception;

	public void deleteProfessor(Professor professor) throws Exception;
	
	public Professor getProfessorItem(Professor professor) throws Exception;
	
	public List<Professor> getProfessorList(Professor professor) throws Exception;
	
}

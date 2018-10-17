package study.spring.myschool.service;

import java.util.List;

import study.spring.myschool.model.StudProfDept;

public interface StudProfDeptService {
	
	public StudProfDept getStudProfDeptItem (StudProfDept student) 
			throws Exception;

	public List<StudProfDept> getStudProfDeptList (StudProfDept student) 
			throws Exception;
	
	public int getStudProfDeptCount (StudProfDept student) 
			throws Exception;
}

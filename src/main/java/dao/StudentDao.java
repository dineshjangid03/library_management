package dao;

import com.entity.Student;

import exception.StudentException;

public interface StudentDao {
	
	public String addStudent(Student student);
	
	public String removeStudent(int id);
	
	public Student studentByID(int id) throws StudentException;

}

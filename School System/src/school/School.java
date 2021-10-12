package school;

import java.util.List;

/*
 * Created by Mahmoud Abdelazim in 12 October 2021.
 * ArrayList is the Dynamic Array in Java. it
 * equals Vector in cpp
 * School has Many Teachers, many students
 *  
 */

public class School {
	 
	private List<Teacher> teachers ;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> studnts) {
		this.teachers = teachers;
		this.students = studnts;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	// The getters of the class

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeachers(Teacher T) {
		teachers.add(T);
	}
	
	
	public List<Student> getStudnts() {
		return students;
	}

	public void addStudent(Student S) {
		students.add(S);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
		
	// The setters of the class
	
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void setStudnts(List<Student> studnts) {
		this.students = studnts;
	}

	public static void setTotalMoneyEarned(int totalMoney) {
		 	totalMoneyEarned = totalMoney;
	}

	// The methods of the class
	
	public static void updateTotalMoneyEarned(int mon) {
		totalMoneyEarned += mon;
	}

	public static void setTotalMoneySpent(int totalMoney) {
		totalMoneySpent = totalMoney;
	}
	
	public static void updateTotalMoneySpent(int spn) {
		totalMoneyEarned -= spn;
		totalMoneySpent += spn;
	}


}

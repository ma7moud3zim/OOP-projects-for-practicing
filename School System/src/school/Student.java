package school;

/*
 * Created by Mahmoud Abdelazim in 11 October 2021 
 * This class is responsible for keep tracking of students.
 * 
 */


public class Student {
	private int id; 
	private String name;
	private int  grade;
	private int feesPaid;
	private int feesTotal;
		
	public Student(int id, String name, int grade) {
		feesPaid = 0;
		feesTotal = 30000;
		this.id = id; 
		this.name = name;
		this.grade = grade;
		
	}

	// Setters of Student's attributes
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void PayFees(int feesPaid) {
		School.updateTotalMoneyEarned(feesPaid);
		this.feesPaid += feesPaid;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}

	// Getters of Student's attributes
	
	public int getGrade() {
		return grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal - feesPaid;	
	}



}


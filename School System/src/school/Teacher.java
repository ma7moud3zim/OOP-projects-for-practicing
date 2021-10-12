package school;


/*
 * Created by Mahmoud Abdelazim in 11 October 2021 
 * This class is responsible for keep tracking of Teachers attributes
 * such as name, id and the salary of each teacher.
 * 
 */

public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryEarend;
	
	
	// Constructor for creating new teacher object
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name  = name; 
		this.salary = salary;
		this.salaryEarend = 0;
	}
	
	public void updateSalary(int newSalary) {	
		salary = newSalary;
	}
	
	// The getters of attributes
	public String getName() {
		return name;		
	}
	
	public int getId() {
		return id;		
	}
	
	public int getSalary() {
		return salary;		
	}
	
	/*
	 * New method to add the teacher's salaries to
	 * the salary and remove them from the total
	 * money earned
	 */
	
	public void receiveSalary(int salary) {
		salaryEarend+=salary;
		School.updateTotalMoneySpent(salary);
	}
	
}

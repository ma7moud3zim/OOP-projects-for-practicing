package school;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher lissy = new Teacher(112, "Lizzy", 300);
		Teacher Mal= new Teacher(113, "Maly", 50);
		Teacher Samy = new Teacher(114, "Samy", 300);
		
		Student Samara = new Student(112 , "Samara", 2);
		Student gara = new Student(114 , "Gara", 12);
		Student raby = new Student(115, "Raby", 4);
		
		List<Teacher> teacherlist = new ArrayList();
		teacherlist.add(lissy);
		teacherlist.add(Mal);
		teacherlist.add(Samy);

		List<Student> stdnt = new ArrayList();
		stdnt.add(Samara);
		stdnt.add(gara);
		stdnt.add(raby);
		
		School GHS = new School(teacherlist, stdnt);
		Samara.PayFees(111); 
		raby.PayFees(221); 
 
		System.out.println("GHS Money is:" + GHS.getTotalMoneyEarned());
		
		  System.out.println("------Making SCHOOL PAY SALARY----");
	        lissy.receiveSalary(lissy.getSalary());
	        System.out.println("GHS has spent for salary to " + lissy.getName()
	        +" and now has $" + GHS.getTotalMoneyEarned());

	        Mal.receiveSalary(Mal.getSalary());
	        
	        System.out.println("GHS has spent for salary to " + Mal.getName()
	                +" and now has $" + GHS.getTotalMoneyEarned());

	     // The next line print the address that the object points to.
	        System.out.println(Samy);
	        
	     // The right way to print the name of the object
	        System.out.println(Samy.getName());
	        
	        Samy.receiveSalary(Samy.getSalary());

		
	}

}

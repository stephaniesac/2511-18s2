package equals.example;

import java.time.LocalDate;
import java.time.Month;

public class TestEquals {
	public static void main(String[] args) {

		Employee e1 = new Employee("Bill", 50000);
		Employee e2 = new Employee("Bill", 50000);

		System.out.println("======== Questions for Tut Group =====");

		System.out.println("==What do you expect when you test whether an Employee is equal to an Employee with the same name and salary (and vice versa)?");
		System.out.println("Result: " + e1.equals(e2));
    System.out.println("Result: " + e2.equals(e1));
	    // System.out.println("The equals() method is symmetric as e1.equals(e2) and e2.equals(e1) produce same result\n");

		// Now raise salary of e1
		e1.raiseSalary(10);
		System.out.println("===Salary of e1 is increased by 10%. Are e1 and e2 equal?");
		System.out.println("Result: " + e1.equals(e2));


		LocalDate hireDate = LocalDate.of(2018, Month.JANUARY, 10);
		Employee e3 = new Manager("Bill",50000,hireDate);

		System.out.println("\n=== What output do you expect when getClass().getName() is called in the toString method of Employee with a Manager object?");
    System.out.println("Result: " + e3.getClass());

    // Now testing the equality of a manager and an employee with same name and salary
    System.out.println("\n====What do you expect when you test whether a Manager is equal to an Employee with the same name and salary (and vice versa)?");
    System.out.println("Result: " + (e1.equals(e3)));

    Employee e4 = new Manager("Bill",50000,hireDate);

    System.out.println("====What do you expect when you test whether a Manager is equal to an Manager with the same name and salary (and vice versa)?");
    System.out.println("Result: " + (e3.equals(e4)));
 	}


}

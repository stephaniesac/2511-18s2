import java.time.LocalDate;

public class EmployeeTester {

  public static void main(String[] args) {
    System.out.println("WEEK02 LAB: Employee & Manager Demo");

    Employee e = new Employee("Steph", 100);
    Manager m = new Manager("RichSteph", 5000, LocalDate.now());


    // Employee a = m;
    // System.out.println(a.getClass());
    // System.out.println(a.getHireDate());

  }
}

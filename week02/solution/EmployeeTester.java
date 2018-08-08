import java.time.LocalDate;

public class EmployeeTester {

  public static void main(String[] args) {
    System.out.println("WEEK02 LAB: Employee & Manager Demo");

    Employee e = new Employee("Steph", 100);
    System.out.println(e.toString());

    Manager m = new Manager("RichSteph", 5000, LocalDate.now());
    System.out.println(m.toString());

    Employee a = m;
    System.out.println("\nPrinting out details of Employee that is a Manager!");
    System.out.println("Class: " + a.getClass());
    System.out.println("Calling toString():");
    System.out.println(a.toString());
    // Following line will not work because a is treated like an Employee
    // System.out.println(a.getHireDate());
  }
}

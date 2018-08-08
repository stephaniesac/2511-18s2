package equals.example;

public class Employee {
	private String name;
	private int salary;

  /**
   * Check if one object is equal to this employee
   * @param otherObject object to compare if is equal to this object
   */
  //
	@Override
  public boolean equals(Object other) {

		return true;
  }


  /**
   * Constructs an Employee
   * @param name the employee name
   * @param salary the employee salary
   */
  public Employee(String name, int salary)
  {
     this.name = name;
     this.salary = salary;
  }

  public String getName(){
	  return this.getName();
  }
  /**
   * Standard definition of toString
   * Note that getClass().getName() returns the exact class of the object,
   * which may be a subclass of Employee such as Manager
   */
  public String toString()
  {
     return getClass().getName()
        + "[name=" + name
        + ",salary=" + salary
        + "]";
  }
  /**
   * Raise the salary of the employee
   * @param increase
   */
  public void raiseSalary(double increase) {
      // Make sure the increase is not less than 0
      if (increase > 0) {
          salary += salary*increase/100;
      }
  }
}

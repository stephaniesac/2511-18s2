public class Employee {
  private String name;
  private float  salary;

  // Generating from commandline: javadoc *.java
  /**
   * Employee constructor
   * @param name   Employee name
   * @param salary Employee salary
   */
  public Employee(String name, float salary) {
    this.name = name;
    this.salary = salary;
  }

  /**
   * Sets employee name
   * @param name Employee name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets Employee name
   * @return employee name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets employee salary
   * @param salary Employee's salary
   */
  public void setSalary(float salary) {
    this.salary = salary;
  }

  /**
   * Gets employee salary
   * @return Employee's salary
   */
  public float getSalary() {
    return this.salary;
  }

  /**
   * Overriding Object's toString function
   * @return String containing Employee details
   */
  @Override
  public String toString() {
    return this.name + " earns " + Float.toString(salary);
  }
}

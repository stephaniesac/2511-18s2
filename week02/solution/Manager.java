import java.time.LocalDate;

public class Manager extends Employee {
  private LocalDate hireDate;

  /**
   * Manager constructor.
   * @param name     Manager's name
   * @param salary   Manager's salary
   * @param hireDate Manager's hire date
   */
  public Manager(String name, float salary, LocalDate hireDate) {
    super(name, salary);
    this.hireDate = hireDate;
  }

  /**
   * Gets Manager's hire date.
   * @return Manager's hire date.
   */
  public String getHireDate() {
    return this.hireDate.toString();
  }

  /**
   * Sets hireDate.
   * @param hireDate LocalDate object with Manager's hire date.
   */
  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  /**
   * Overrides Object's toString() function to print details of Manager object.
   * @return String with Manager details.
   */
  @Override
  public String toString() {
    return "Hired on " + this.hireDate.toString()
          + ", Manager " + super.toString();
  }
}

import java.time.LocalDate;

// TODO inherits from Employee
public class Manager{
  private LocalDate hireDate;


  // TODO Write out constructors
  public Manager(String name, float salary, LocalDate hireDate) {

  }

  // Public getters and setters
  public String getHireDate() {
    return this.hireDate.toString();
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  // TODO document Javadoc

  // TODO Override toString()
}

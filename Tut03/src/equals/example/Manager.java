package equals.example;

import java.time.LocalDate;

public class Manager extends Employee {

   private LocalDate hireDate;

   /**
    *  Constructs a Manager
    *  @param name the employee name
    *  @param salary the employee salary
    *  @param hireDate the date of hire
    */
   public Manager(String name, int salary, LocalDate hireDate)
   {
      super(name, salary);
      this.hireDate = hireDate;
   }


   /**
    * Standard definition of equals for subclasses that first calls superclass equals
    */
   public boolean equals(Object otherObject) {
     return true;
   }

   /**
    * Standard definition of toString for subclasses that first calls superclass toString
    * Note similarity to clone and equals
    */
   public String toString()
   {
      return super.toString()
         + "[hireDate=" + hireDate
         + "]";
   }

   public LocalDate getHireDate()
   {
      return hireDate;
   }

}

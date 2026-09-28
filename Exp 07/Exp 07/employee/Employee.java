package employee;

public class Employee {
   int id;
   String name;
   double salary;

   public Employee(int var1, String var2, double var3) {
      this.id = var1;
      this.name = var2;
      this.salary = var3;
   }

   public void displayEmployee() {
      System.out.println("Employee ID: " + this.id);
      System.out.println("Employee Name: " + this.name);
      System.out.println("Employee Salary: " + this.salary);
   }
}

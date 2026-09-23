abstract class Employee {
    static String company = "Google";

    public String department;
    private double salary;
    protected String designation;
    String location;

    Employee(String department, double salary,
             String designation, String location) {
        this.department = department;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract void displayRole();
}

class Developer extends Employee {
    Developer(String department, double salary,
              String designation, String location) {
        super(department, salary, designation, location);
    }

    @Override
    void displayRole() {
        System.out.println("Role        : Software Developer");
    }
}

public class exp02 {
    public static void main(String[] args) {
        Developer emp = new Developer(
            "CSE",
            60000,
            "Software Developer",
            "Bangalore"
        );

        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Company     : " + Employee.company);
        System.out.println("Department  : " + emp.department);
        System.out.println("Salary      : Rs." + emp.getSalary());
        System.out.println("Designation : " + emp.designation);
        System.out.println("Location    : " + emp.location);

        emp.displayRole();

        emp.setSalary(65000);
        System.out.println("\nUpdated Salary: Rs." + emp.getSalary());
    }
}

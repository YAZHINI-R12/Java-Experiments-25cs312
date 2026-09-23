import java.util.Scanner;

public class exp03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter Department: ");
        String department = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\nStudent Admission Details");
        System.out.println("-------------------------");
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Department   : " + department);
        System.out.println("Age          : " + age);
        System.out.println("Percentage   : " + percentage + "%");

        sc.close();
    }
}

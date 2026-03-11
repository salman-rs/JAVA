package faris;
import java.util.Scanner;

//Superclass
class Employee {
 int empId;
 String name;
 double salary;
 String address;

 // Constructor to initialize Employee data
 Employee(int empId, String name, double salary, String address) {
     this.empId = empId;
     this.name = name;
     this.salary = salary;
     this.address = address;
 }
}

//Subclass
class Teacher extends Employee {
 String department;
 String subjects;  // Changed to plural to match description

 // Constructor to initialize Teacher + Employee data
 Teacher(int empId, String name, double salary, String address,
         String department, String subjects) {
     super(empId, name, salary, address);  // Call superclass constructor
     this.department = department;
     this.subjects = subjects;
 }

 // Display function
 void display() {
     System.out.println("Employee ID: " + empId);
     System.out.println("Name       : " + name);
     System.out.println("Salary     : " + salary);
     System.out.println("Address    : " + address);
     System.out.println("Department : " + department);
     System.out.println("Subjects   : " + subjects);
     System.out.println("---------------------------");
 }
}

public class TeacherDetails {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of teachers: ");
     int n = sc.nextInt();
     sc.nextLine();  // consume newline

     // Array of Teacher objects
     Teacher[] teachers = new Teacher[n];

     for (int i = 0; i < n; i++) {
         System.out.println("\nEnter details of Teacher " + (i + 1));

         System.out.print("Employee ID: ");
         int id = sc.nextInt();
         sc.nextLine();  // consume newline

         System.out.print("Name: ");
         String name = sc.nextLine();

         System.out.print("Salary: ");
         double salary = sc.nextDouble();
         sc.nextLine();  // consume newline

         System.out.print("Address: ");
         String address = sc.nextLine();

         System.out.print("Department: ");
         String dept = sc.nextLine();

         System.out.print("Subjects taught (comma-separated if multiple): ");
         String subjects = sc.nextLine();

         // Creating Teacher object using constructor
         teachers[i] = new Teacher(id, name, salary, address, dept, subjects);
     }

     // Display details
     System.out.println("\nTeacher Details:");
     for (Teacher teacher : teachers) {
         teacher.display();
     }

     sc.close();
 }


	}



package faris;
import java.util.Scanner;

class Employee {
    private int eNo;
    private String eName;
    private double eSalary;

    // Method to read employee details
    void read(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        eNo = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Employee Name: ");
        eName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        eSalary = sc.nextDouble();
    }

    // Getter method for Employee Number
    int getENo() {
        return eNo;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class employeesearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        // Reading employee details
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i].read(sc);
        }

        // Searching employee
        System.out.print("\nEnter Employee Number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].getENo() == searchNo) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}
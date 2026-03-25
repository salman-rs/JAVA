package faris;
import java.util.Scanner;

//User-defined exception
class NegativeNumberException extends Exception {
 NegativeNumberException(String message) {
     super(message);
 }
}

public class AverageCalculator {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of elements: ");
     int n = sc.nextInt();

     int sum = 0;
     int count = 0;

     for (int i = 0; i < n; i++) {
         try {
             System.out.print("Enter number " + (i + 1) + ": ");
             int num = sc.nextInt();

             if (num < 0) {
                 throw new NegativeNumberException("Negative numbers are not allowed!");
             }

             sum += num;
             count++;

         } catch (NegativeNumberException e) {
             System.out.println("Exception: " + e.getMessage());
             i--; // retry the same input
         } catch (Exception e) {
             System.out.println("Invalid input! Please enter an integer.");
             sc.next(); // clear invalid input
             i--; // retry
         }
     }

     if (count > 0) {
         double avg = (double) sum / count;
         System.out.println("Average of positive numbers: " + avg);
     } else {
         System.out.println("No positive numbers entered.");
     }

     sc.close();
 }


	}



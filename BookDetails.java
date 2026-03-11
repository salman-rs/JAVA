package faris;
import java.util.Scanner;

//Base class
class Publisher {
 String publisherName;

 void getPublisher() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Publisher Name: ");
     publisherName = sc.nextLine();
 }
}

//Book class inheriting Publisher
class Book extends Publisher {
 String title;
 double price;

 void getBook() {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Book Title: ");
     title = sc.nextLine();

     System.out.print("Enter Book Price: ");
     price = sc.nextDouble();
 }
}

//Literature class inheriting Book
class Literature extends Book {

 void display() {
     System.out.println("\nCategory: Literature");
     System.out.println("Title: " + title);
     System.out.println("Price: " + price);
     System.out.println("Publisher: " + publisherName);
 }
}

//Fiction class inheriting Book
class Fiction extends Book {

 void display() {
     System.out.println("\nCategory: Fiction");
     System.out.println("Title: " + title);
     System.out.println("Price: " + price);
     System.out.println("Publisher: " + publisherName);
 }
}

//Main class
public class BookDetails {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of books: ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {

         System.out.println("\n1. Literature");
         System.out.println("2. Fiction");
         System.out.print("Enter your choice: ");
         int choice = sc.nextInt();

         if (choice == 1) {
             Literature l = new Literature();
             l.getPublisher();
             l.getBook();
             l.display();

         } else if (choice == 2) {
             Fiction f = new Fiction();
             f.getPublisher();
             f.getBook();
             f.display();

         } else {
             System.out.println("Invalid Choice");
         }
     }

     sc.close();
 }


	}



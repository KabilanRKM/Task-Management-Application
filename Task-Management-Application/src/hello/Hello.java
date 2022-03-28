package hello;

import java.util.Scanner;
public class Hello {
    
    private static Scanner sc;

	public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Hello "+name+"! Welcome to Event Management System.");
   
   
    }

}

package firstprogramJan2020;

import java.util.Scanner;
public class Classwork252020 {
	public static void main(String[]args)	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Classwork252020\n"
				+ "This program will calculate the product of 3 numbers");
		
		System.out.println("Enter your first number");
		int first = keyboard.nextInt();
		
		System.out.println("Enter your second number");
		int second = keyboard.nextInt();
		
		System.out.println("Enter your third number");
		int third = keyboard.nextInt();
		
		int product = first*second*third;
		System.out.println("The product of these three numbers is " + product);

	}
}

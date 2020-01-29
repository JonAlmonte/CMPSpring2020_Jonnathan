package firstprogramJan2020;
/**
 * 
 * @author Jonnathan
 * created 1/29/2020
 * description	: This program will calculate birth year
 **/

import java.util.Scanner;
public class firstprogram2020 {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to First Program\n"
				+"This program calculates the Birth Year");
		
		
		System.out.println("Enter Your Age");
		int age = keyboard.nextInt();
		
		int BY = 2020-age;
		System.out.println("The most likely year you were born is "+BY);

	}

}

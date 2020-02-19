package Classwork;
	/*
	 * 
	 *@author Jonnathan 
	 *
	 */
	import java.util.Scanner;
	public class CoatAdvisor {
		
		public static void main(String[]args) {
			Scanner kb = new Scanner(System.in);
			
			System.out.println("Welcome to Coat Advisor");
			System.out.println("Enter Weather in fareinheit");
			double weather = kb.nextDouble();
			
			if(weather>70)
				System.out.println("It's hot)");
			else if (weather>50)
				System.out.println("It's warm");
			else if (weather>30)
				System.out.println("It's cold, wear a jacket");
			else
				System.out.println("Its too cold, wear a coat");
		}

	}

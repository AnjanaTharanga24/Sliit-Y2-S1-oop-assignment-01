package assignment01;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		String option;
		
		
		Geometry g1 = new Geometry();
		Scanner sc = new Scanner(System.in);
		
		do {
		g1.displayMenu();
 		
		switch(g1.choice) {
		
		case 1:
			g1.AreaOfCircle();
			break;
			
		case 2:
			g1.AreaOfRectangle();
			break;
			
		case 3:
			g1.AreaOfTriangle();
		    break;
		    
		case 4:
			System.out.println("Exit the program!!");
			
		default:
            System.out.println("Invalid option, please try again.");
            break;
		}
		System.out.print("Do you want to continue? (Y/N) :");
        option = sc.next();
		
		}while(option.equalsIgnoreCase("Y"));
		
		
		if(option.equalsIgnoreCase("N"))
		{
			System.out.println("Thank you");
		}
		else 
		{
			System.out.println("Invalid input");
		}

		

	}

}

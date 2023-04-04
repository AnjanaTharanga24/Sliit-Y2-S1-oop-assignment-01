package assignment01;
import java.util.Scanner;
public class Geometry {
	
	Double Area,radius,length,width,Base,Height;
	int choice;
	
   
    
	
     Scanner sc = new Scanner(System.in);
     
     public double getAreaOfCircle()
 	{
 		Area = 22/7 * ( radius * radius);
 		return Area;
 	}
     
     public double getAreaOfRectangle()
 	{
 		Area = length * width;
 		
 		return Area;
 	}
     
     public double getAreaOfTriangle()
 	{
 		Area = (1 / 2) * Base * Height;
 		
 		return Area;
 	}
     
	public void AreaOfCircle()
	{
		System.out.print("Please enter the radius : ");
		radius = sc.nextDouble();
		
		
		System.out.println("The area of the Circle is " + getAreaOfCircle());
	
		
	}
	
	public void AreaOfRectangle()
	{
		System.out.print("Please enter the length : ");
		length = sc.nextDouble();
		
		System.out.print("Please enter the width :");
		width = sc.nextDouble();
		
		System.out.println("The area of the rectangle is" + getAreaOfRectangle());
		
		
	}
	
	public void AreaOfTriangle()
	{
		System.out.print("Please enter the base :");
		Base = sc.nextDouble();
		
		System.out.print("Please enter the height :");
		Height = sc.nextDouble();
		
		System.out.println("The area of the Triangle " + getAreaOfTriangle());
		
		
		
	}
	
	
	public void displayMenu()
	{
		System.out.println("Geometry calculator"+"\n 1. Calculate the Area of a Circle"+"\n 2. Calculate the Area of a Rectangle "+"\n 3. Calculate the Area of a Triangle"+"\n 4. Quit");
        System.out.print("Enter your choice (1-4) :");
        choice = sc.nextInt();
	}
	
	

}

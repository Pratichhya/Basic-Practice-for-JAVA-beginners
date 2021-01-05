package assignment1_pratichhyaSharma;
import static java.lang.Math.PI;

import java.lang.Math.*;
import java.util.Scanner;

public class userInputArea_withexception {
	public static void main(String[] args) {
		//asked to give input
		System.out.print("Enter the radius of circle:");
		//including exception handling
		try {
			Scanner i = new Scanner(System.in);
			//the function nextfloat belong to util.scanner used to scan and record the user input
			int radius = i.nextInt();
			double area=PI*radius*radius;
			System.out.println("The area of circle when you give radius: "+radius +"is "+area);
			
		}
		catch(NumberFormatException e)
		 {
		 System.out.println("Invalid radius value" + e);
		 System.exit(0);
		 }
		
				
	}

}

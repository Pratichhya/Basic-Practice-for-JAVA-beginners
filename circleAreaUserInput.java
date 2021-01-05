package assignment1_pratichhyaSharma;
//importing math package
import static java.lang.Math.PI;

import java.io.IOException;
//importing utility package
import java.util.*;
//defining class
public class circleAreaUserInput {
	public static void main(String[] args){ 
		//scanner class is from util package and is usedd for taking user input
		Scanner i = new Scanner(System.in);
		//asked to give input
		System.out.print("Enter the radius of circle:");
		//the function nextfloat belong to util.scanner used to scan and record the user input
		float r = i.nextFloat();
		//formula
		Double a =PI*r*r;
		//printing area
		System.out.println("The area of circle when you give radius: "+r +"is "+a);
		
	}

}

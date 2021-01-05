//defining the file package
package assignment1_pratichhyaSharma;
//importing predefined mathematical forms
import static java.lang.Math.PI;
//defining a class
public class circleArea {
	//defining the main function
	public static void main(String[] args) {
		//assigning data type to r
		int r=4;
		
		// output area a has been given double data type and since int can be converted to double
		//so still having different data type in this care wont generate error
		double a=PI*r*r;   //circle area formula
		//printing output
		System.out.println("The area of a Circle with radius "+ r+" is "+a);
	}

}

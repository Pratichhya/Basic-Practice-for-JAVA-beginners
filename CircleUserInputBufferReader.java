package assignment1_pratichhyaSharma;
//for importing math
import static java.lang.Math.PI;
//for importing 
import java.util.*;
//for using bufferreader, exception, parsing
import java.io.*;

public class CircleUserInputBufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader rad = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the circle radius:");
		int radius = Integer.parseInt(rad.readLine());
		double area = PI*radius*radius;
		System.out.println("The area of a Circle with radius "+ radius+" is "+area);
	}

}

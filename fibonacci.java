package assignment1_pratichhyaSharma;
//defining class
public class fibonacci {
	public static void main(String[] args) {
		//defining data type integer
		int i=0, j=1;
		//printing the first value of the series to avoid confusion later when assigning second value
		System.out.println(i);
		//starting of a for loop to iterate 20 time
		for(int k=0; k<19; k++)
		{
			//expression of fibonacci where number=previous digit+ preceding digit
			int f =i+j;
			System.out.println(f);
			// assigning the value of preceding to previous variable and and output value to the preceding variable
			i=j;
			j=f;
		}
	}

}

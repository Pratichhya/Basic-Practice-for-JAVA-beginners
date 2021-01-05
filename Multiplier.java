package projectone;

//creating a class HelloWorld
public class Multiplier {
	public static void main(String[] args)
    {
        //call method
        int x = multiply(50);
        System.out.println(x);
        
    }
    //define a new method
    static int multiply(int a)
    {
       int x =2*a;
        //print method
        System.out.println(x);
       return x;
    
   }
}


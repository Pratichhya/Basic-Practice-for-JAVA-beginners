package projectone;

//creating a class HelloWorld
public class HelloWorld {
	public static void main(String[] args)
    {
        //call method
        printhello();
        
    }
    //define a new method
    static void printhello()
    {
        int i = 1;
        //defining int variable
        for (i=1; i<10000; i++) {
            //this gives error 
            int x= i*100;
        //print method
        System.out.println(x +"Hello world");
    
   }
   }
}


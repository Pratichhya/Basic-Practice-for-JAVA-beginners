package projectone;
//define class
public class EvenNumbers {
	public static void main (String[] args) {
		even();
		
	}
	public static void even() {
		int i =1;
		for (i=1; i<10000; i++) {
		if (i%2==0)
			System.out.println(i);
		}
			
	}

}

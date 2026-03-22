import java.util.Scanner;

public class Task8 {
	public static void main(String[] args){
	
	Scanner inputCollector = new Scanner(System.in);
	
	int sum = 0;
	for ( int i=0; i++ <10;) {
		System.out.printf("Enter a number %d%n", i);
		int input = inputCollector.nextInt();
		if ( input > 100) {
		  System.out.printf("Enter a number %d%n", i);
		  input = inputCollector.nextInt();
	      }
           sum += input; 

}
	System.out.printf("The sum is %d", sum);
}

}    
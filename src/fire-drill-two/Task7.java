import java.util.Scanner;

public class Task7 {
	public static void main(String[] args){
	
	Scanner inputCollector = new Scanner(System.in);
	
	int sum = 0;
	int evenCount = 0;
	for ( int i=0; i++ <10;) {
		System.out.printf("Enter a number %d%n", i);
		int input = inputCollector.nextInt();
		
		if ( input % 2 == 0) {
		  sum += input; 
		  evenCount += 1;
	}

}
	int average = sum / evenCount;
	System.out.printf("The sum is %d and the average is %d", sum, average);
}

}    
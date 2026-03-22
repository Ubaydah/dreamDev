import java.util.Scanner;

public class Task10 {
	public static void main(String[] args){
	
	Scanner inputCollector = new Scanner(System.in);
	
	int sum = 0;
	int validCount = 0;
	for ( int i=0; i++ <10;) {
		System.out.printf("Enter a number %d%n", i);
		int input = inputCollector.nextInt();
		if ( input < 100) {
		    sum += input;
		    validCount += 1; 
	      }
          

}
	int average = sum / validCount;
	System.out.printf("The average is %d", average);
}

}    
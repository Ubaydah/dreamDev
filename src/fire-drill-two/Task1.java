import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){
	
	Scanner inputCollector = new Scanner(System.in);
	
	System.out.println("Enter a number 1");
	
	int sum = inputCollector.nextInt();
	for ( int i=1; i++ <10;) {
		System.out.printf("Enter a number %d%n", i);
		int input = inputCollector.nextInt();

		sum += input; 

}

	System.out.printf("The sum is %d%n", sum);
}

}    
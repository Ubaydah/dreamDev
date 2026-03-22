import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
	
	Scanner inputCollector = new Scanner(System.in);

	System.out.println("Enter a number");
	int number = inputCollector.nextInt();
	
	int result = number % 2;
	
	if (result == 0){
		System.out.println("This is even");	
	
}
	if (result == 1){
		System.out.println("This is odd");
	} 
	
	
	} 

}
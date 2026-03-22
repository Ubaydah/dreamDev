
public class TaskSeven {
	public static void main(String[] args) {
	
	int i = 0;
	while( i++ < 10) {
	
	if ( i % 4 == 0) {
		int sum = 0;
		int result = 1;
		for ( int j = 0; j++ < 5;){
		result = result * i; 
		sum += result;
	} 
		System.out.printf("%d ", sum);
	
	  
	} 
	
}

	}

}
package week1Assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 5;
		int n1 = 0;
		int n2 = 1;
		
		System.out.print(n1 + " " + n2 + " ");
		
		for (int i=0; i <=n ; i++) {
			int n3 = n1 + n2; ;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " "); 
		}
	}
}
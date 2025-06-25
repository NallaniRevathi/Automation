package week1Assignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int n = 13;
	
		if(n<=1) {
			System.out.println("Enter a number greater than 1");
			}
		for (int i =2; i <= n/2;) 
		{
			if (n%i==0) 
			{
			System.out.println(n +" is Not a Prime Number");
			break;
			}
		else {
			System.out.println(n +" is Prime Number");
			break;
			
			}
	    }
	}
	
}


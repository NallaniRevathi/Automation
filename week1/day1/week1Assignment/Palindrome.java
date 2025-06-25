package week1Assignment;

public class Palindrome {

	public static void main(String[] args) {

		int input = 343;
		
		int output = 0;
		
		int original = input; 
		
		if(input<0) {
		System.out.println("Not a valid input");
		return;
	}
		for(int i = input; i > 0 ; i = i / 10) {
			int j = i % 10;
			output = output * 10 + j ;
		}
		
		if(original==output) {
			System.out.println(input +" is a Palindrome number");
		} else { 
			System.out.println(input +" is Not a Palindrome number");
		}

}
}
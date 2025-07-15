package week3Assignments;

public class Intersection {

	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		System.out.print("The Intersection of two Array is:");
		//condition for common values
		for (int i = 0; i < a.length; i++) {
			for (int j = 0 + 1; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}

	}

}

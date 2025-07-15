package week3Assignments;

import java.util.Arrays;

public class FindMissingValue {

	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 2, 8, 6, 7 };
		//sorting array
		Arrays.sort(a);
		int i = a[0];
		//iteration
		while (i < a.length) {
			//condition for missing value
			if (a[i] - a[i - 1] == 1) {
			} else {
				System.out.println("Missing number is " + (a[i - 1] + 1));
			}
			i++;

		}

	}
}

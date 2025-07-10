package week3Assignments;

import java.util.Arrays;

public class FindMissingValue {

	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(a);
		int i = a[0];
		while (i < a.length) {
			if (a[i] - a[i - 1] == 1) {
			} else {
				System.out.println("Missing number is " + (a[i - 1] + 1));
			}
			i++;

		}

	}
}

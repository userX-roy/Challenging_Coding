/*
 * Q: https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/lola-and-candies-36b57b1b/
 * 
 * Contributed by : Saikat Roy
 * Modified by :
 * Email : rsaikat415@gmail.com
*/

package hackerEarth;

import java.util.Scanner;

public class HackerEarth3 {
	public static void main(String[] args) {
		// System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		meth(sc.nextInt());
		sc.close();
	}

	static void meth(int num) {
		int count = 0;
		int total;
		for (int i = 1; i < num; i = (i + 2)) {
			total = i;
			for (int j = i + 2; j <= num; j = (j + 2)) {
				if (i + j > num) {
					break;
				}
				total = total + j;
				if (total == num) {
					count++;
					break;
				}
			}
		}
		if (num % 2 != 0) {
			count++;
		}

		System.out.println(count);
	}

}
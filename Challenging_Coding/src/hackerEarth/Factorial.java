package hackerEarth;

/*
 * Contributed by : Saikat Roy
 * Modified by :
 * Email : rsaikat415@gmail.com
 */

import java.util.Scanner;

class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print(facto(sc.nextInt()));

		sc.close();

	}

	static int facto(int num) {
		if (num == 0) {
			return 1;
		} else {
			return (num * facto(num - 1));
		}
	}
}

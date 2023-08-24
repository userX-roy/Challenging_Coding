/* https://www.studocu.com/in/document/k-l-deemed-to-be-university/aws-developer-associate-dumps/sample-paper-wiley-edge-graduate-recruitment/42079348 

Visit this website and view Questions on Coding -> this one is 1st Question

*/

/*
 * Contributed by : Saikat Roy
 * Modified by :
 * Email : rsaikat415@gmail.com
 */

package fromVariousSources;

import java.util.Scanner;

public class WileyEdgeSampleQ1 {

	Scanner sc = new Scanner(System.in);

	public int meth1() {

		int N = sc.nextInt();

		int A = Integer.MAX_VALUE, B = Integer.MAX_VALUE, C = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			char dish = sc.next().toUpperCase().charAt(0);
			int T = sc.nextInt();
			if (dish == 'A') {
				if (T < A) {
					A = T;
				}
			}
			if (dish == 'B') {
				if (T < B) {
					B = T;
				}
			}
			if (dish == 'C') {
				if (T < C) {
					C = T;
				}
			}
		}

		if ((A + B) < C) {
			return (A + B);
		} else {
			return C;
		}
	}

	public static void main(String[] args) {
		System.out.println(new WileyEdgeSampleQ1().meth1());
	}
}

package fromVariousSources;

/* https://www.studocu.com/in/document/k-l-deemed-to-be-university/aws-developer-associate-dumps/sample-paper-wiley-edge-graduate-recruitment/42079348 

Visit this website and view Questions on Coding -> this one is 2nd Question

*/

import java.util.Scanner;

public class WileyEdgeSampleQ2 {

	Scanner sc = new Scanner(System.in);

	boolean isEmpty(int[] cratesArray) {
		int count = 0;
		for (int i : cratesArray) {
			if (i != 0) {
				++count;
				break;
			}
		}
		return (count == 0 ? false : true);
	}

	int meth1() {
		int k = 0, l = 0, total = 0;
		int crates = sc.nextInt();
		int[] cratesArray = new int[crates];

		for (int i = 0; i < cratesArray.length; i++) {
			cratesArray[i] = sc.nextInt();
		}

		while (isEmpty(cratesArray)) {
			for (int i = 0; i < cratesArray.length; i++) {
				if (k < cratesArray[i]) {
					k = cratesArray[i];
					l = i;
				}
			}

			total = total + k;
			if (l != cratesArray.length - 1 && l != 0) {
				cratesArray[l] = cratesArray[l - 1] = cratesArray[l + 1] = k = 0;
			} else if (l == 0) {
				cratesArray[l] = cratesArray[1] = k = 0;
			} else if (l == cratesArray.length - 1) {
				cratesArray[l] = cratesArray[l - 1] = k = 0;
			}
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println(new WileyEdgeSampleQ2().meth1());
	}
}

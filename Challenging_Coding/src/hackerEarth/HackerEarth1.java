package hackerEarth;

//Q : https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/prime-array-5e448ef6/
import java.util.*;

public class HackerEarth1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) throws Exception {
		int testCase, numberOfEle, i = 0, counter = 0;
		testCase = sc.nextInt();
		int[] outPut = new int[testCase];

		while (i < testCase) {
			counter = 0;
			numberOfEle = sc.nextInt();
			int[] elearr = new int[numberOfEle];

			for (int j = 0; j < elearr.length; j++) {
				elearr[j] = sc.nextInt();
			}

			for (int z = 0; z < elearr.length; z++) {
				if (elearr[z] != 1 && !isPrime(elearr[z])) {
					elearr[z] = 0;
				}
			}

			Arrays.sort(elearr);

			for (int z = 0; z <= elearr.length - 2; z++) {
				if (elearr[z] == 1) {
					for (int j = z + 1; j < elearr.length - 1; j++) {
						if (elearr[j] == 1) {
							for (int j2 = j + 1; j2 < elearr.length; j2++) {
								if (elearr[j2] == 1) {
									continue;
								} else {
									counter++;
								}
							}
						} else {
							break;
						}
					}
				}
			}
			outPut[i] = counter;
			i++;
		}
		for (int j : outPut) {
			System.out.println(j);
		}
	}

	static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
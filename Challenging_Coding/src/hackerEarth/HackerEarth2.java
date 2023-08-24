// Q : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seven-segment-display-nov-easy-e7f87ce0/

/*
 * Contributed by : Saikat Roy
 * Modified by :
 * Email : rsaikat415@gmail.com
 */
package hackerEarth;

import java.util.Scanner;

public class HackerEarth2 {
	static Scanner scanner = new Scanner(System.in);
	
	int totalStick;
	
	void numCanBeWritten(int num) {
		
		if (num%2==0) {
			for (int i = 0; i < num/2; i++) {
				System.out.print(1);
			}
		}
		else {
			System.out.print(7);
			for (int i = 0; i < num/2-1; i++) {
				System.out.print(1);
			}
		}
		
	}
	
	
	int howManyMatch(char num) {
		
		if (num=='0'||num=='6'||num=='9') {
			return (totalStick+6);
		}
		if (num=='2'||num=='3'||num=='5') {
			return (totalStick+5);
		}
		if (num=='8') {
			return (totalStick+7);
		}
		if (num=='4') {
			return (totalStick+4);
		}
		if (num=='1') {
			return (totalStick+2);
		}
		if (num=='7') {
			return (totalStick+3);
		}
		
		return 0;
	}
	
	
	void solutionMethod(int testCase) {
		int i=0;		
		String [] inpStrings = new String[testCase];
		
		while (i<testCase) {
			inpStrings[i] = scanner.next();
			i++;
		}
		
		i=0;
		
		while (i<testCase) {
			totalStick=0;
			for (int j = 0; j < inpStrings[i].length(); j++) {
				totalStick = howManyMatch(inpStrings[i].charAt(j));
			}
			numCanBeWritten(totalStick);
			System.out.println();
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		HackerEarth2 hackerEarth2 = new HackerEarth2();
		hackerEarth2.solutionMethod(scanner.nextInt());				
	}

}

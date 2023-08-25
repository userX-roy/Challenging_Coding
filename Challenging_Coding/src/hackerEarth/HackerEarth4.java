//Q:->  https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/subarray-3-3dbc3f50/




/*
 * Approach : Count the number of 1's pair.
 * means : 1 1 1 0 0 0 1 -> 1 swap
 * 		 : 1 0 1 1 1 1 0 0 1 0 1 0 1 0 1 0 0 0 ->	
 */

package hackerEarth;

import java.util.Scanner;

public class HackerEarth4 {
	static Scanner sc = new Scanner(System.in);
	int sol(int[] arr) {
		int zeroCount=0,oneCount=0,setOfOne=0;
		for (int i = 0; i < arr.length; i++) {			
			if (arr[i]==0) {
				zeroCount++;
			}
			
			if (arr[i]==1) {				
					if (i<arr.length-1) {
						if (arr[i + 1] == 1) {
							setOfOne++;
							oneCount++;
							i++;
						} 
					}
				oneCount++;
			}
		}		
		if (zeroCount<(oneCount-1)&&zeroCount!=0&&oneCount!=0) {
			return -1;
		}
		if ((zeroCount>=oneCount-1||zeroCount==oneCount) && setOfOne!=0) {
			return setOfOne;
		}
		return 0;
	}	
	void meth1(int testCase) {
		int i=0,noEle=0;
		int [] resultArr = new int[testCase];
		while(i<testCase) {
			noEle = sc.nextInt();
			int[] eleArr = new int[noEle];
			for (int j = 0; j < noEle; j++) {
				eleArr[j]=sc.nextInt();
			}
			resultArr[i]=sol(eleArr);
			i++;
		}
		for (int j : resultArr) {
			System.out.println(j);
		}
	}		
	public static void main(String[] args) {
		new HackerEarth4().meth1(sc.nextInt());
	}

}

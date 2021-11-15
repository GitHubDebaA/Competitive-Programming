// Exactly N plus 1 Values; complete: n
// date: 27.10.2021

import java.util.*;
import java.math.BigInteger;

class Main {
	public static void main(String args[]) {
		int t, n;
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while(t != 0) {
			n = 0;
			if(S.hasNextInt()) n = S.nextInt();

			N1VALUES(n);
			t -= 1;
		}
	}

	public static void N1VALUES(int n) {

		BigInteger b1 = new BigInteger("2");
		BigInteger b2 = new BigInteger("1");

		int m = n+1;
		BigInteger A[] = new BigInteger[m];

		for(int i=0; i<m; i++) {
			A[i] = b1.pow(i);
		}

		A[n-1] = A[n-2];
		A[n] = A[n-1].add(b2);

		for(int i=0; i<m; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
}

/*
sum = 8

8 4 2 1

3 2 2 1

sum = 16
16 8 4 2 1
5 4 4 2 1

sum = 32, n=5;
0 1 2 3 4  5
1 2 4 8 16 32
1 2 4 8 8 9

sum =  64
1 2 4 8 16 32 64
1 2 4 8 16 16 17
*/
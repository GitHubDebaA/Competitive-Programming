// Xor Equation; complete: n
// date: 12.11.2021

import java.util.*;


class Main {
	public static void main(String[] args) {
		int t, n;
		long A[]; 
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while(t != 0) {
			n = 0;
			if(S.hasNextInt()) n = S.nextInt();			

			A = new long[n];

			for(int i=0; i<n; i++) {
				A[i] = 0;
				if(S.hasNextLong()) A[i] = S.nextLong();
			}

			System.out.println(XOREQN(A));
			t -= 1;
		}
	}


	public static long XOREQN(long A[]) {
		int n = A.length;
		long ixor, x=0, xor, MAX, finalX, MAX_bit, one = 1;
		MAX_bit = 64;

		for(int i=0; i<64; i++) {
			xor = 0;
			x = (one << i);

			for(int j=0; j<n ; j++)
				xor = A[i] ^ xor;
			if((i == 63) ) return -1;
		}
		return x;
	}
}
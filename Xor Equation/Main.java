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

			System.out.println(XOREQN2(A));
			t -= 1;
		}
	}


	// public static long XOREQN(long A[]) {
	// 	int n = A.length;
	// 	long ixor, x=0, xor, MAX, finalX, MAX_bit;
	// 	ixor = A[0];
	// 	MAX = Long.MIN_VALUE;
	// 	for(int i=1; i<n; i++) {
	// 		if(A[i] > MAX) MAX = A[i];
	// 		ixor = ixor ^ A[i]; 
	// 	}

	// 	MAX_bit = (int)(Math.log(MAX)/Math.log(2));
	// 	MAX = (long)Math.pow(2, MAX_bit);


	// 	if(ixor == 0) return 0;

	// 	x = (int) Math.pow(2, decToBin(ixor));

	// 	if(x > MAX) return -1;

	// 	finalX = x;
	// 	while(ixor != 0) {
	// 		A[0] += x;
	// 		xor = A[0];
	// 		for(int i=1; i<n; i++) {
	// 			A[i] += x;
	// 			xor = xor ^ A[i];
	// 		}

	// 		if(xor == 0) return x;
	// 		ixor = xor;
	// 		x = (long) Math.pow(2, decToBin(ixor));
	// 		finalX += x;
	// 		if(x > MAX) return -1;
	// 	}
	// 	return x;
	// }

	public static int XOREQN2(long A[]) {
		int n = A.length, MAX_bit = 0;
		List<Integer> binaryArray[] = new List<Integer>(n); 
		for(int i=0; i<n; i++){
			long x = A[i];
			binaryArray[1] = decToBin(x);
		}
		for(int i=0; i<n; i++) {
			System.out.println(binaryArray[i]);
		}
		return 0;
	}

	public static List<Integer> decToBin(long x) {
		List<Integer> list = new ArrayList<Integer>();

		if(x == 0) {
			list.add(0);
			return list;
		}
		while(x > 0) {
			list.add(x % 2);
			x /= 2;
		}
		return list;
	}
}
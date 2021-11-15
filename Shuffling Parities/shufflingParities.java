//Shuffling Parities; codechef : 06.09.21; complete : y

import java.util.*;

class Main {
	public static void main(String args[]) {
		int t, n, A[];
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while(t != 0) {
			n = 0;
			if(S.hasNextInt()) n = S.nextInt();

			A = new int[n+1];

			for(int i=1; i<=n; i++) {
				A[i] = 0;
				if(S.hasNextInt()) A[i] = S.nextInt();
			}

			System.out.println(shufflingParities(A, n));
			t -= 1;
		}
	}

	public static int shufflingParities(int A[], int n) {
		int loc, sum= 0;
		for(int i=1; i<=n; i++) {
			if(i % 2 == 0) {
				if(A[i] % 2 == 0) {
					loc = findNextODD(A, i);
					if(loc != -1) swapArrayElem(A, i,  loc);
				}
			}
			else {
				if(A[i] % 2 != 0) {
					loc = findNextEVEN(A, i);
					if(loc != -1) swapArrayElem(A, i, loc);
				}
			}

			sum += (A[i]+i) % 2;
		}
		//System.out.println(Arrays.toString(A));

		return sum;
	}

	public static int findNextODD(int A[], int loc) {
		for(int i = loc+1; i<A.length; i++) {
			if(A[i] % 2 != 0) return i;
		}
		return -1;
	}

	public static int findNextEVEN(int A[], int loc) {
		for(int i = loc+1; i<A.length; i++) {
			if(A[i] % 2 == 0) return i;
		}
		return -1;
	}

	public static void swapArrayElem(int A[], int index1, int index2) {
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;
		return;
	}
}
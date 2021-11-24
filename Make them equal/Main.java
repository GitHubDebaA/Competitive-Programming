// Make them equal; complete: y
// date: 22.11.2021

import java.util.*;

class Main {
	public static void main(String[] args) {
		int t, n, A[];
		Scanner scan = new Scanner(System.in);

		t = 0;
		if(scan.hasNextInt()) t = scan.nextInt();

		while (t != 0) {
			n = 0;
			if(scan.hasNextInt()) n = scan.nextInt();

			A = new int[n];

			for(int i=0; i<n; i++) {
				A[i] = 0;
				if(scan.hasNextInt()) A[i] = scan.nextInt();
			}

			System.out.println(MAKEEQUAL2(n, A));
			t -= 1;
		}
	}

	//Efficient Solution
	public static int MAKEEQUAL2(int n, int A[]) {
		if(A.length <= 1) return 0;

		Arrays.sort(A);
		int max = A[A.length - 1], min = A[0];
		if(max == min) return 0;
		else return max - min;
	}

	public static int MAKEEQUAL(int n, int A[]) {
		Arrays.sort(A);
		int i, j, loc, times;

		i = 0;
		loc = 0;
		times = 0;
		while (i < n) {
			j = loc + 1;
			while(j < n) {
				if(A[i] != A[j]) {
					loc = j;
					break;
				}
				j += 1;
			}
			if(j == n) return times;
			times += A[j] - A[i];
			A[i] = A[j];
		}
		return times;
	}
}
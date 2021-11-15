//minimize digit sum; codechef : 07.09.21; complete : n

import java.util.*;

class Main {
	public static void main(String args[]) {
		int q, n, l, r;
		Scanner S = new Scanner(System.in);

		q = 0;
		if(S.hasNextInt()) q = S.nextInt();

		while(q != 0) {
			n = 0;
			if(S.hasNextInt()) n = S.nextInt();

			l = 0;
			if(S.hasNextInt()) l = S.nextInt();

			r = 0;
			if(S.hasNextInt()) r = S.nextInt();

			System.out.println(MINDIDSUM(n, l, r));

			q -= 1;
		}
	}

	public static int MINDIDSUM(int n, int l, int r) {
		int k = 0, MINBASE = 0, MAX = Integer.MAX_VALUE;

		if(l <= n && r>= n) return n;
		if(l >= n) return l;

		for(int cBase = r; cBase >=l; cBase--) {

			if(r >= n && n % cBase == 0) return cBase;
			
			k = baseConversion(n, cBase, MAX);
			// System.out.println("digit sum : "+k);
			if(k < MAX) {
				MAX = k;
				MINBASE = cBase;
			}

			if(MAX == 1) break;
		}
		return MINBASE;
	}


	public static int baseConversion(int n, int Base, int MAX) {
		int digitSum = 0, number = n;

		while(number != 0) {
			digitSum += number % Base;
			number /= Base;

			if(digitSum >= MAX) break;
		}

		return digitSum;
	}
}
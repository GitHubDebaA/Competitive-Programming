// Hill Sequence; complete: y
// date: 12.11.2021

import java.util.*;

class Main {
	public static void main(String[] args) {
		int t, n, A[];
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while (t != 0) {
			n = 0;
			if(S.hasNextInt()) n = S.nextInt();

			A = new int[n];
			for(int i=0; i<n; i++) {
				A[i] = 0;
				if(S.hasNextInt()) A[i] = S.nextInt();
			}
			HILLSEQ(A);
			t -= 1;
		}
	}

	public static void HILLSEQ(int A[]) {
		List<Integer> A1 = new ArrayList<Integer> ();
		List<Integer> A2 = new ArrayList<Integer> ();

		Map<Integer, Integer> hm1 = new HashMap<Integer, Integer>();

		int max = Integer.MIN_VALUE, x, oc;

		for(int i=0; i<A.length; i++) {
			x = A[i];
			if(x > max) max = x;
			if(hm1.containsKey(x)) {
				oc = hm1.get(x);
				if(oc >= 2) {
					System.out.println(-1);
					return;
				}
				hm1.put(x, oc+1);
				A2.add(x);
			}
			else {
				hm1.put(x, 1);
				A1.add(x);
			}
		}

		oc = hm1.get(max);
		if(oc > 1) {
			System.out.println(-1);
			return;
		}
		Collections.sort(A1);
		Collections.sort(A2);
		Collections.reverse(A1);


		for (int i : A2 )
			System.out.print(i+" ");

		for (int i : A1 )
			System.out.print(i+" ");

		System.out.println();
	}
}
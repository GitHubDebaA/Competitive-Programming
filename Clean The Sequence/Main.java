// Clean The Sequence; complete: n
// date: 16.11.2021

import java.util.*;

class Main {
	public static void main(String[] args) {
		int t, n, k, A[];
		Scanner scan = new Scanner(System.in);

		t = 0;
		if(scan.hasNextInt()) t = scan.nextInt();

		while (t != 0) {
			HashMap<Integer, Boolean> map = new HashMap<>();

			n = 0;
			if(scan.hasNextInt()) n = scan.nextInt();

			k = 0;
			if(scan.hasNextInt()) k = scan.nextInt();

			A = new int[n];
			for(int i=0; i<n; i++) {
				A[i] = 0;
				if(scan.hasNextInt()) A[i] = scan.nextInt();

				if(!map.containsKey(A[i])) map.put(A[i], true);
			}

			CLESEQ2(n, k, A, map);
			t -= 1;
		}
	}

	public static void CLESEQ2(int n, int k, int A[], HashMap<Integer, Boolean> map) {
		int count, c = 0;
		for(Map.Entry<Integer, Boolean> element : map.entrySet()) {

			if(c == k) break;
			int val = element.getKey();
			System.out.println("val: "+val);
			count = 0;
			int loc = 0, flag = 0;
			for(int i=1; i<n; i++) {
				System.out.println("loc: "+loc);
				if(A[i] == val) {
					flag = 1;
					continue;
				}
				else if(A[i-1] == val) {
					
				}
				else { 
					if(flag == 1) {
						if(A[i] != A[loc]) count += 1;
					}
					else {
						if(A[i] != A[i-1]) count += 1;
					}
				}
			}	

			System.out.println(count+ " ");
			c += 1;
		}
		System.out.println();
	}

	public static void CLESEQ(int n, int k, int A[], HashMap<Integer, Boolean> map) {

		int count;
		for(Map.Entry<Integer, Boolean> element : map.entrySet()) {
			int val = element.getKey();
			count = 0;
			List<Integer> list = new ArrayList<> ();
			for(int j=0; j<n; j++) {
				if(A[j] != val) list.add(A[j]);
			}

			for(int j=1; j<list.size(); j++) {
				if(list.get(j) != list.get(j-1)) count += 1;
			}
			// System.out.println(list);
			System.out.print(count+" ");
		}
		System.out.println();
	}
}
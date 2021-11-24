// weird palindrome making; complete: y
// date: 08.11.2021

import java.util.*;

class Main {

	public static void main(String[] args) {
		int t, n, A[];
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt(); 		

		while(t != 0) {
			n = 0;
			if(S.hasNextInt()) n = S.nextInt();

			A = new int[n];

			for(int i=0; i<n; i++) {
				A[i] = 0;
				if(S.hasNextInt()) A[i] = S.nextInt();
			}

			System.out.println(MAKEPAL(A, n));
			t -= 1;
		}
	}

	public static int MAKEPAL(int A[], int n) {
		int count = 0;
		for(int i=0; i<n; i++) {
			if(A[i] % 2 != 0) count += 1; 
		}	

		count -= 1;

		return (int)Math.ceil((double)count/ (double)2);
	}
}


/*
	test input output section

	input-1
	n = 1
	A = 4
	So there is only one characater, it always palindrome
	e.g. 'aaaa'

	operation required = 0

	input-2
	n = 3
	A = 4, 3, 1

	So, there is three character, let a, b, c

	aaaa, bbb, c

	aaaa
	bbb
	c -> a

	operation requires = 1


	input-3	
	n = 3
	A = 5, 7, 3

	let, character are a, b, c
	'aaaaa', 'bbbbbbb', 'ccc'

	operation required = 1

	input-4
	n = 3
	A = 2, 4, 6

	let, character are, a,b,c
	'aa', 'bbbb', 'cccccc'

	cccbbaabbccc
	operation required = 0;
*/
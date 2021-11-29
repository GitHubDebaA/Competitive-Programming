// Can You Eat It; complete: y
// date: 26.11.2021

import java.util.*;

class Main {
	public static void main(String[] args) {
		int t, n, k;
		Scanner scan = new Scanner(System.in);

		t = 0;
		if(scan.hasNextInt()) t = scan.nextInt();

		while (t != 0) {
			
			n = 0;
			if(scan.hasNextInt()) n = scan.nextInt();

			k = 0;
			if(scan.hasNextInt()) k = scan.nextInt();

			System.out.println(COMPCAND(n, k));
			t -= 1;
		}
	}

	public static int COMPCAND(int n, int k) {
		if(n % k != 0) return -1;
		else return n / k;
	}
}
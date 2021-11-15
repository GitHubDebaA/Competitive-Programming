//Longest AND Subarray; codechef : 07.09.21; complete : y

import java.util.*;

class Main {
	public static void main(String args[]) {
		int t, n;
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while(t != 0) {
			n = 0;
			if(S.hasNextInt()) n = S.nextInt();

			System.out.println(longestSubarray(n));
			t -= 1;
		}
	}

	public static int longestSubarray(int n) {

		if(n == 1) return 1;

		int ans = (int)(Math.log(n) / Math.log(2));
		ans = (int) Math.pow(2, ans);

		int a = (n - ans) + 1;

		if(ans == n) return n/2;
		else return Math.max(a, ans/2);
	}
}
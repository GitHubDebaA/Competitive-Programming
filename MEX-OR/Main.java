// MEX-OR; codechef; Complete : y
// date : 04.10.2021

import java.util.*;

class Main {
	public static void main(String args[]) {
		int t, x;
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while(t != 0) {
			x = 0;
			if(S.hasNextInt()) x = S.nextInt();

			System.out.println(MEX(x));
			t -= 1;
		} 
	}

	public static int MEX(int x) {
		if(x == 0) return 1;

		int i = 0, or=0, n=0;

		while(or <= x) {
			or = (int)Math.pow(2, i+1)-1;
			n = i;			
			i += 1;
		}
		return (int)Math.pow(2, n);
	}
}
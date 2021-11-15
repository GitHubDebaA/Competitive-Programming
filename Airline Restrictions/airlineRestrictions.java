//Airline Restrictions; codechef problem : 06.09.21; complete : y

import java.util.*;

class Main {
	public static void main(String args[]) {
		int t, a, b, c, d, e;
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) {
			t = S.nextInt();
		}

		while(t != 0) {
			a = 0;
			if(S.hasNextInt()) {
				a = S.nextInt();
			}

			b = 0;
			if(S.hasNextInt()) {
				b = S.nextInt();
			}

			c = 0;
			if(S.hasNextInt()) {
				c = S.nextInt();
			}

			d = 0;
			if(S.hasNextInt()) {
				d = S.nextInt();
			}

			e = 0;
			if(S.hasNextInt()) {
				e = S.nextInt();
			}

			if(airlineRestrictions(a, b, c, d, e)) System.out.println("YES");
			else System.out.println("NO");

			t -= 1;
		}
	}

	public static boolean airlineRestrictions(int a, int b, int c, int d, int e) {
		if(a+b <= d && c <= e) return true;
		else if(a+c <= d && b <= e) return true;
		else if(b+c <= d && a <= e) return true;
		else return false;
	}
}
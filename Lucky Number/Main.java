// Lucky Number; codechef; complete : y
// date : 15.10.2021


import java.util.*;

class Main{
	public static void main(String args[]) {
		int t, a, b, c;
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while(t != 0) {
			a = 0;
			if(S.hasNextInt()) a = S.nextInt();

			b = 0;
			if(S.hasNextInt()) b = S.nextInt();

			c = 0;
			if(S.hasNextInt()) c = S.nextInt();

			if(checkIfHeWin(a, b, c)) System.out.println("YES");
			else System.out.println("NO");
			t -= 1;
		}
	}

	public static boolean checkIfHeWin(int a, int b, int c) {
		if(a == 7) return true;
		if(b == 7) return true;
		if(c == 7) return true;
		return false;
	}
}
// Can Reach; complete: y
// date: 26.11.2021

import java.util.*;

class Main {
	public static void main(String[] args) {
		int t, x, y, k;
		Scanner scan = new Scanner(System.in);

		t = 0;
		if(scan.hasNextInt()) t = scan.nextInt();

		while(t != 0) {
			x = 0;
			if(scan.hasNextInt()) x = scan.nextInt();

			y = 0;
			if(scan.hasNextInt()) y = scan.nextInt();

			k = 0;
			if(scan.hasNextInt()) k = scan.nextInt();

			if(CAN_REACH(x, y, k)) System.out.println("YES");
			else System.out.println("NO");
			t -= 1;
		}
	}

	public static boolean CAN_REACH(int x, int y, int k) {
		if(x % k == 0 && y % k == 0) return true;
		else return false;
	}
}
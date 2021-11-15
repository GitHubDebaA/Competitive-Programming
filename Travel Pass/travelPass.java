//Travel Pass; codechef problem : 06.09.21; complete : n

import java.util.*;

class Main {
	public static void main(String args[]) {
		int t, n, a, b;
		String S;
		Scanner scan = new Scanner(System.in);

		t = 0;
		if(scan.hasNextInt()) t = scan.nextInt();

		while(t != 0) {
			n = 0;
			if(scan.hasNextInt()) n = scan.nextInt();

			a = 0;
			if(scan.hasNextInt()) a = scan.nextInt();		

			b = 0;
			if(scan.hasNextInt()) b = scan.nextInt();

			if(scan.hasNextLine()) scan.nextLine();			
			S = new String();
			if(scan.hasNextLine()) S += scan.nextLine();

			System.out.println(travelPass(S, n, a, b));

			t -= 1;
		}
	}

	public static int travelPass(String S, int n, int a, int b) {

		int distTime = 0, stateTime = 0;

		for(int i=0; i<n; i++) {
			if(S.charAt(i) == '0') distTime += a;
			else stateTime += b;
		}

		return distTime + stateTime;
	}
}
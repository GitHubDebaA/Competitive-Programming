// Wildcard Replacement; complete: n
// date: 12.11.2021

import java.util.*;

class Main {
	public static void main(String[] args) {
		int t, q, l[], r[];
		String s;
		Scanner scan = new Scanner(System.in);

		t = 0;
		if(scan.hasNextInt()) t = scan.nextInt();
		if (scan.hasNextLine()) scan.nextLine();
		while (t != 0) {
			s = "";
			if (scan.hasNextLine()) s = scan.nextLine();

			q = 0;
			if(scan.hasNextInt()) q = scan.nextInt();

			l = new int[q];
			r = new int[q];

			for(int i=0; i<q; i++) {
				l[i] = 0;
				if(scan.hasNextInt()) l[i] = scan.nextInt();

				r[i] = 0;
				if(scan.hasNextInt()) r[i] = scan.nextInt();
			}
			System.out.println(s)
			if(scan.hasNextLine()) scan.nextLine();
			t -= 1;
		}
	}
}
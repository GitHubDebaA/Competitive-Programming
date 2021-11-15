// Which Fuel is Cheaper; complete: y
// date: 07.11.2021

import java.util.*;

class Main {
	public static void main(String[] args) {
		int t, x, y, a, b, k;
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt(); 

		while(t != 0) {
			x = 0;
			if(S.hasNextInt()) x = S.nextInt();

			y = 0;
			if(S.hasNextInt()) y = S.nextInt();

			a = 0;
			if(S.hasNextInt()) a = S.nextInt();

			b = 0;
			if(S.hasNextInt()) b = S.nextInt();

			k = 0;
			if(S.hasNextInt()) k = S.nextInt();

			System.out.println(CHEAPFUEL(x, y, a, b, k));
			t -= 1;
		}
	}

	public static String CHEAPFUEL(int x, int y, int a, int b, int k) {
		int PAK = (a * k) + x;
		int DAK = (b * k) + y;

		if(PAK == DAK) return "SAME PRICE";
		else if(PAK > DAK) return "DIESEL";
		else return "PETROL";
 	}
}
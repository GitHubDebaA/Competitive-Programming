// Xor Equal; codechef : 07.09.21; complete : y

import java.util.*;

class Main {
	public static void main(String args[]) {
		int t, n, x, temp;

		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while(t != 0) {
			n = 0;
			if(S.hasNextInt()) n = S.nextInt();

			x = 0;
			if(S.hasNextInt()) x = S.nextInt();

			Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
			for(int i=0; i<n; i++) {
				temp = 0;
				if(S.hasNextInt()) temp = S.nextInt();

				int count = map.getOrDefault(temp, 0);
            	map.put(temp, count + 1);
			}

			PALINT(map, x);

			t -= 1;
		}
	}

	public static void PALINT(Map <Integer, Integer> map, int x) {
		int ans = 0, count = 0;

		if(x == 0) {
			for(Map.Entry mapI : map.entrySet()) {
				ans = Math.max(ans, (int)mapI.getValue()); 
			}
			count = 0;
		}
		else {
			for(Map.Entry mapI : map.entrySet()) {
				int k = (int) mapI.getKey() ^ x;

				if(map.containsKey(k)) {
					if((int)map.get(k) + (int)mapI.getValue() > ans) {
						ans = (int)map.get(k) + (int)mapI.getValue();
						count = (int)mapI.getValue();
					}
					else if((int)map.get(k) + (int)mapI.getValue() == ans) {
						count = Math.min(count, (int)mapI.getValue());
					}
				}
				if((int)mapI.getValue() > ans) {
					ans = (int)mapI.getValue();
					count = 0;
				}
				else if((int)mapI.getValue() == ans) {
					count = 0;
				}
			}
		}
		System.out.println(ans +" "+count);
	}	
}
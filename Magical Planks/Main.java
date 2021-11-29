// Magical Planks; complete: y
// date: 26.11.2021

import java.util.*;
class Main {
	public static void main(String[] args) {
		int t, n;
		String S;
		Scanner scan = new Scanner(System.in);

		t = 0;
		if(scan.hasNextInt()) t = scan.nextInt();

		while(t != 0) {
			n = 0;
			if(scan.hasNextInt()) n = scan.nextInt();
			if(scan.hasNextLine()) scan.nextLine();

			S = "";
			if(scan.hasNextLine()) S = scan.nextLine();


			System.out.println(MKGPLNKS2(n, S));
 			t -= 1;
		}
	}

	public static int MKGPLNKS2(int n, String S) {
		double answer = 0.0;
		for(int i=1; i<n; i++) {
			if(S.charAt(i) != S.charAt(i-1)) answer += 0.5;
		}
		// System.out.println("answer: "+answer);
		return (int) Math.round(answer);
	}

//one test case give WA
	public static int MKGPLNKS(int n, String S) {
		
		int temp = 0, answer = 0;
		for(int i=0; i<n; i++) {
			if(S.charAt(i) == 'W') {
				int j = i+1;
				while(j < n && S.charAt(j) == S.charAt(i)) j++;
				temp += j;			
			}
			else if(i>0 && S.charAt(i) != S.charAt(i-1)) {
				answer += 1;
				int k = i+1;
				while(k<n && S.charAt(k) == S.charAt(i)) k++;
				temp += k;
			}
			else {
				int k = i+1;
				while(k<n && S.charAt(k) == S.charAt(i)) k++;
				temp += k;
			}
		}

		if(temp == 0) return 0;
		else return answer;
	}
}
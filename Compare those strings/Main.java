// Compare those strings; complete: y
// date: 22.11.2021

import java.util.*;

class Main {
	public static void main(String[] args) {
		int t, n;
		String A, B;
		Scanner scan = new Scanner(System.in);

		t = 0;
		if(scan.hasNextInt()) t = scan.nextInt();

		while(t != 0) {
			n = 0;
			if(scan.hasNextInt()) n = scan.nextInt();

			if(scan.hasNextLine()) scan.nextLine();

			A = "";
			if(scan.hasNextLine()) A = scan.nextLine();

			B = "";
			if(scan.hasNextLine()) B = scan.nextLine();

			System.out.println(STRCOMPARE2(n, A, B));
			t -= 1;
		}
	}

	public static int STRCOMPARE2(int n, String A, String B) {
			int times = 0, flag = 0;
        
            if(A.charAt(n-1) < B.charAt(n-1)) {
                flag = 1;
                times += 1;
            }
            
            for(int i = n-2; i>=0; i--) {
                if(A.charAt(i) < B.charAt(i)) {
                    times += 1;
                    flag = 1;
                }
                else if(A.charAt(i) == B.charAt(i)) {
                    if(flag == 1) times += 1;
                }
                else {
                    flag = 0;
                }
                
            } 
		return times;
	}

	public static int STRCOMPARE(int n, String A, String B) {
		String ta = "", tb = "";
		int times = 0;
		int i = 0, j = n-1;
		while(i <= j) {
			if(i == j) {
				if(A.charAt(i) == B.charAt(i)) {
					ta = A.substring(i);
					tb = B.substring(i);
					if(ta.compareTo(tb) < 0) times += 1;
				}
				else if(A.charAt(i) < B.charAt(i)) times += 1;
			}
			else {
				if(A.charAt(i) == B.charAt(i)) {
					ta = A.substring(i);
					tb = B.substring(i);
					if(ta.compareTo(tb) < 0) times += 1;
				}
				else if(A.charAt(i) < B.charAt(i)) times += 1;

				if(A.charAt(j) == B.charAt(j)) {
					ta = A.substring(j);
					tb = B.substring(j);
					if(ta.compareTo(tb) < 0) times += 1;
				}
				else if(A.charAt(j) < B.charAt(j)) times += 1;
			}
			i += 1;
			j -= 1;
		}
		return times;
	}
}
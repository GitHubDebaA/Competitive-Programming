// Palindromic Binary Numbers; complete: n
// date: 21.11.2021

import java.util.*;

class Main {
	private static final int goodNumbersList[] = {1, 3, 5, 7, 9, 15, 17, 21, 27, 31, 33, 45, 51, 63, 65, 73, 85, 93, 99, 107, 119, 127, 129, 153, 165, 189, 195, 219, 231, 255, 257, 273, 297, 313, 325, 341, 365, 381, 387, 403, 427, 443, 455, 471, 495, 511, 513, 561, 585, 633, 645, 693, 717, 765, 771, 819, 843, 891, 903, 951, 975}; 
	public static void main(String[] args) {
		int t, n;
		Scanner scan = new Scanner(System.in);

		t = 1000;
		if(scan.hasNextInt()) t = scan.nextInt();

		while (t != 0) {
			n = t;
			if(scan.hasNextInt()) n = scan.nextInt();
			// System.out.println("n : "+n);
			PALSUM(n);
			scan.nextLine();
			t -= 1;
		}
	}

	public static void PALSUM(int n) {
		int sum = n;
		List <Integer> li = new ArrayList<Integer> ();
		while(sum != 0) {
			int loc = search(sum);
			li.add(goodNumbersList[loc]);
			sum -= goodNumbersList[loc];
		}
		System.out.println(li.size());

		for(int i = 0; i<li.size(); i++) 
			System.out.print(li.get(i) + " ");
		System.out.println();
	}

	public static int search(int n) {
		int lb = 0, ub = goodNumbersList.length-1;

		while(lb<=ub) {
			int mid = (lb+ub)/2;

			if(goodNumbersList[mid] == n) return mid;
			if(goodNumbersList[mid] > n) {
				ub = mid - 1;
			}
			else {
				lb = mid + 1;
			}
		} 
		return ub;        
	}
}

class makeGoodNumbers {

	makeGoodNumbers() {
		goodNumbers();
	}

	void goodNumbers() {
		for(int i=1; i<=1000; i++) {
			if(isgoodNumbers(i)) 
				System.out.print(i +", ");
		}
		System.out.println();
	}

	boolean isgoodNumbers(int n){
		String bin = decToBin(n);
		return isPalindrome(bin);
	}

	String decToBin(int n) {
		String bin = "";
		
        while (n > 0) 
        {
            bin += Integer.toString(n % 2);
            n = n / 2;
        }

        return bin;
	}

	boolean isPalindrome(String s) {
		int i=0, j=s.length()-1;
		while(i <= j) {
			if(s.charAt(i) != s.charAt(j)) return false;
			i += 1;
			j -= 1;
		}
		return true;
	}
}
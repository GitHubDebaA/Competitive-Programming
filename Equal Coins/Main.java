// Equal Coins; complete: y
// date: 07.11.2021

import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		int t, x, y;
		Scanner S = new Scanner(System.in);
		sampleTest obj = new sampleTest();
		// obj.controller();	
		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while(t != 0) {
			x = 0;
			if(S.hasNextInt()) x = S.nextInt();

			y = 0;
			if(S.hasNextInt()) y = S.nextInt();

			System.out.println(EQUALCOIN(x, y));
			t -= 1;
		}
	}

	public static String EQUALCOIN(int x, int y) {
		int total = x + (2 * y);
		if(total % 2 != 0) return "NO";

		if(x % 2 != 0) return "NO";
		else {
			if(x == 0) {
				if(y % 2 == 0) return "YES";
				else return "NO";
			}	
			return "YES";
		}
	}
}

class sampleTest {
	//create sample list upto 50
	private int maxCoin = 50;

	void controller() throws IOException {
		String myUS = "----------------------------------------------------------------------------------\n";
		String heading = "Equal Coin Sample test \t\t\t\t\t\t\t\t\t\t\t\tflag\n "+ myUS+"\n	total Coins 	1rs Coins	2rs coins	total amount	1rs 	2rs 	amount \n"+myUS;
		makeSampleIO(heading);
		for(int i=1; i<=maxCoin; i++) {
			makeXY(i);
		}
	}

	//make all possible X & Y for this.n
	void makeXY(int n) throws IOException {
		makeSampleIO(n);
		int x = 0, y = n, amount = 0;
		String flag = "";
		for(; x<=n; x++) {
			amount = x + (2 * y);
			makeSampleIO(x, y, amount);

			if(x % 2 == 0) flag = "\t\t\t\teven";
			else flag = "\t\t\t\todd";
			makeSampleIO(flag);

			if(y % 2 == 0) flag = " \teven";
			else flag = " \todd";
			makeSampleIO(flag);

			if(amount % 2 == 0) flag = " \teven";
			else flag = " \todd";
			makeSampleIO(flag);			

			makeSampleIO("\n");
			y -= 1;
		}

		String myUS = "----------------------------------------------------------------------------------\n";
		makeSampleIO(myUS);
	}

	void makeSampleIO(int val) throws IOException{
		FileWriter fw = new FileWriter("output.txt", true);
		String temp = Integer.toString(val);

		fw.write("\n\t"+temp);

		fw.close();
	}

	void makeSampleIO(int val1, int val2, int amount) throws IOException{
		FileWriter fw = new FileWriter("output.txt", true);
		String temp1 = Integer.toString(val1);
		String temp2 = Integer.toString(val2);
		String temp3 = Integer.toString(amount);

		String temp = "";
		if(val1 == 0) temp = "\t\t\t\t"+temp1 + "\t\t\t" + temp2+ "\t\t\t"+amount;
		else temp = "\t\t\t\t\t"+temp1 + "\t\t\t" + temp2+"\t\t\t"+amount;

		fw.write(temp);

		fw.close();
	}	

	void makeSampleIO(String S) throws IOException{
		FileWriter fw = new FileWriter("output.txt", true);

		fw.write(S);

		fw.close();
	}	
}
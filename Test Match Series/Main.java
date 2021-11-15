// Test Match Series; codechef; complete : n
// date : 15.10.2021


import java.util.*;

class Main {
	public static void main(String args[]) {
		int t, R[] = new int [5];
		Scanner S = new Scanner(System.in);

		t = 0;
		if(S.hasNextInt()) t = S.nextInt();

		while(t != 0) {
			for(int i=0; i<R.length; i++) {
				R[i] = 0;
				if(S.hasNextInt()) R[i] = S.nextInt();
			}
			int winner = whoWins(R);

			if(winner == 0) System.out.println("DRAW");
			else if(winner == 1) System.out.println("INDIA");
			else System.out.println("ENGLAND"); 
			t -= 1;
		}
	}

	public static int whoWins(int R[]) {
		int winnerSet[] = {0, 0, 0}, winner;

		for(int i=0; i<R.length; i++) {
			if(R[i] == 0) winnerSet[0] += 1;
			else if(R[i] == 1) winnerSet[1] += 1;
			else winnerSet[2] += 1;
		}

		if(winnerSet[1] > winnerSet[2]) winner = 1;
		else if(winnerSet[1] < winnerSet[2]) winner = 2;
		else winner = 0;

		return winner;
	}
}

// draw	india 	england
// 0		0		5
// 		1		4
// 		2		3

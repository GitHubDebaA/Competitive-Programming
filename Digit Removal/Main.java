// Digit Removal; Codechef; Compplete : y
// date : 08.10.2021
import java.util.*;

class Main {
    public static void main(String[] args) {
        int t, d, n;
        Scanner S = new Scanner(System.in);
        
        t = 0;
        if(S.hasNextInt()) t = S.nextInt();

        while(t != 0) {
            n = 0;
            if(S.hasNextInt()) n = S.nextInt();

            d = 0;
            if(S.hasNextInt()) d = S.nextInt();
            System.out.println(digitRemove(n, d));
            t -= 1; 
        }
    }

    public static int digitRemove(int n, int d) {
        String S = Integer.toString(n);
        char A[] = S.toCharArray();

        if(d == 0) {
            int flag = 0;
            for(int i=0; i<A.length; i++) {
                if(A[i] == '0') {
                    flag = 1;
                }
                
                if(flag == 1) {
                    A[i] = (char) ('1');
                }
            }
            S = new String(A);
            int temp = Integer.parseInt(S);

            return temp - n;
        }

        else if(d == 9) {
            int flag = 0, i, j;
            for(i=0; i<A.length; i++) {
                if(A[i] == '9') {
                    if(i == 0) flag = 1;
                    else {
                        if(flag != 1) flag = 2;
                    }
                    break;
                }
            }

            for(j=i; j<A.length; j++) {
                A[j] = '0';
            }


            if(flag == 2) {
                int loc = i - 1;

                while(loc >= 0) {
                    if(A[loc] == '8') {
                        A[loc] = '0';
                    }
                    else {
                        A[loc] += 1;
                        break;
                    }
                    loc -= 1;
                }
                if(loc == -1) flag = 3;
            }

            S = new String(A);
            if(flag == 1 || flag == 3) {
                S = "1" + S;
            }

            int temp = Integer.parseInt(S);
            return temp - n;
        }

        else {
            int i, j, flag = 0;
            char ch = (char) (d + '0');
            for(i = 0; i < A.length; i++) {
                if(A[i] == ch) {
                    flag = 1; 
                    A[i] = (char) (d + '1');
                    break;
                }
            }

            if(flag == 1) {
                for(j=i+1; j<A.length; j++) {
                    A[j] = '0';                   
                }
            }
            S = new String(A);
            int temp = Integer.parseInt(S);
            return temp - n;
        }
    }
}
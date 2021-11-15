// Yet another MEX problem; codechef; complete : n
// date : 09.10.2021

import java.util.*;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        int t, n, d, A[];
        Scanner S = new Scanner(System.in);

        t = 0;
        if(S.hasNextInt()) t = S.nextInt();

        while(t != 0) {
            n = 0;
            if(S.hasNextInt()) n = S.nextInt();

            d = 0;
            if(S.hasNextInt()) d = S.nextInt();

            A = new int[n];

            for(int i = 0; i < n; i++) {
                A[i] = 0;
                if(S.hasNextInt()) A[i] = S.nextInt();
            }

            System.out.println(kthMex(A, n, d));
            t -= 1;
        }
    }


    public static int kthMex(int A[], int n, int d) {
        int i, j, itr = 0;

        List<Integer> B = new ArrayList<Integer>();
        for(i=0; i<n; i++) {
            for(j=i+1; j<=n; j++) {
                int C[] = Arrays.copyOfRange(A, i, j); 
                System.out.println(Arrays.toString(C));
                B.add(findMex(C));
                itr += 1;
            }
        }
        System.out.println(B);

        return (int)B.get(d-1);
    }

    public static int findMex(int A[]) {
        int n = A.length;
        int T[] = new int[n+1];

        for(int i = 0; i<T.length; i++) {
            T[i] = 0;
        }

        for(int i = 0; i < n; i++) {
            if(A[i] < n) {
                T[A[i]] += 1;
            }
        }

        for(int i = 0; i<T.length; i++) {
            if(T[i] == 0) return i;
        }

        return T.length;
    }
}



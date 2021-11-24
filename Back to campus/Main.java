// Back to campus; complete: y
// date: 22.11.2021

import java.util.*;

class Main {
    public static void main(String[] args) {
        int t, n, k;
        Scanner scan = new Scanner(System.in);
        t = 0;
        if(scan.hasNextInt()) t = scan.nextInt();

        while(t != 0) {
            n = 0;
            if(scan.hasNextInt()) n = scan.nextInt();

            k = 0;
            if(scan.hasNextInt()) k = scan.nextInt();
            System.out.println(MINDAYSRET(n, k));
            t -= 1;
        }
        scan.close();
    }

    public static int MINDAYSRET(int n, int k) {
        return (int)Math.ceil((double)n / (double)k); 
    }
}
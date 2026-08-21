import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();

            long[] a = new long[n];

            if (b == 0) {

                long maxSum = (long) n * (k - 1);

                if (s > maxSum) {
                    System.out.println(-1);
                    continue;
                }

                for (int i = 0; i < n; i++) {

                    a[i] = Math.min(s, k - 1);

                    s -= a[i];
                }
            }else {
                long base = b * k;
                if (s < base) {
                    System.out.println(-1);
                    continue;
                }
                long extra = s - base;
                long maxExtra = (long) n * (k - 1);

                if (extra > maxExtra) {
                    System.out.println(-1);
                    continue;
                }

                a[0] = base;
                for (int i = 1; i < n; i++) {

                    a[i] = Math.min(extra, k - 1);

                    extra -= a[i];
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);

                if (i != n - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
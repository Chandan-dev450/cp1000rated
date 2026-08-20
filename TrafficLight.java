import java.util.*;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            if (c == 'g') {
                System.out.println(0);
                continue;
            }

            int ans = 0;
            int nextGreen = -1;

            for (int i = 2 * n - 1; i >= 0; i--) {

                int idx = i % n;

                if (s.charAt(idx) == 'g') {
                    nextGreen = i;
                }

                if (s.charAt(idx) == c) {
                    ans = Math.max(ans, nextGreen - i);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
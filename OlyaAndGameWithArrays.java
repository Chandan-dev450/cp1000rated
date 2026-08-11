import java.util.*;
public class OlyaAndGameWithArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long sumSecond = 0;
            long globalMin = Long.MAX_VALUE;
            long smallestSecond = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {

                int m = sc.nextInt();

                long min1 = Long.MAX_VALUE;
                long min2 = Long.MAX_VALUE;

                for (int j = 0; j < m; j++) {

                    long x = sc.nextLong();

                    if (x < min1) {
                        min2 = min1;
                        min1 = x;
                    } else if (x < min2) {
                        min2 = x;
                    }
                }

                sumSecond += min2;

                globalMin = Math.min(globalMin, min1);

                smallestSecond = Math.min(smallestSecond, min2);
            }

            long answer = sumSecond - smallestSecond + globalMin;

            System.out.println(answer);
        }

        sc.close();
    }
}

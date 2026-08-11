import java.util.*;

public class Helmets {
    public static class Pair {
    long cost;
    long people;

    Pair(long cost, long people) {
        this.cost = cost;
        this.people = people;
    }
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long p = sc.nextLong();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            Pair[] v = new Pair[n];

            for (int i = 0; i < n; i++) {
                v[i] = new Pair(b[i], a[i]);
            }

            // Sort by cost
            Arrays.sort(v, (x, y) -> Long.compare(x.cost, y.cost));

            long minimumCost = p;
            long alreadyShared = 1;

            for (Pair it : v) {

                long canBeShared = it.people;
                long sharingCost = it.cost;

                if (sharingCost >= p) {
                    break;
                }

                if (alreadyShared + canBeShared > n) {

                    minimumCost +=
                            (n - alreadyShared) * sharingCost;

                    alreadyShared = n;
                    break;

                } else {

                    minimumCost +=
                            canBeShared * sharingCost;

                    alreadyShared += canBeShared;
                }
            }

            minimumCost +=
                    (n - alreadyShared) * p;

            System.out.println(minimumCost);
        }

        sc.close();
    }
}
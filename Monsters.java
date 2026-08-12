import java.util.*;

public class Monsters {

    static class Pair {
        int health;
        int index;

        Pair(int health, int index) {
            this.health = health;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            Pair[] monsters = new Pair[n];

            for (int i = 0; i < n; i++) {
                int health = sc.nextInt();

                int rem = health % k;

                if (rem == 0) {
                    rem = k;
                }

                monsters[i] = new Pair(rem, i + 1);
            }

            Arrays.sort(monsters, (a, b) -> {
                if (a.health != b.health) {
                    return b.health - a.health;
                }

                return a.index - b.index;
            });

            for (Pair monster : monsters) {
                System.out.print(monster.index + " ");
            }
        }

        sc.close();
    }
}
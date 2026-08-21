import java.util.*;

public class BasketBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();

        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        Arrays.sort(P);

        int left = 0;
        int right = N-1;
        int wins = 0;

        while(left <= right){
            int strongest =  P[right];

            int needed = D / strongest + 1;

            if(right - left + 1 < needed){
                break;
            }

            left = left + needed - 1;
            right--;

            wins++;
        }

        System.out.println(wins);

        sc.close();
    }
}
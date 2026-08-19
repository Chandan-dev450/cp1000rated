import java.util.*;

public class MinimumLCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long ans_a = 1, ans_b = n-1;
            for(long i=2; i*i<=n; i++){
                if(n%i == 0){
                    ans_a = n/i;
                    ans_b = n-ans_a;
                    break;
                }
            }
            System.out.println(ans_a + " " + ans_b);
        }

        sc.close();
    }
}
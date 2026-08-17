import java.util.*;
public class SkiResort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextInt();
            long q = sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                a[i] = (a[i] <= q) ? 1 : 0;
            }

            long cnt = 0;
            long ways = 0;
            for(int i=0; i<n; i++){
                if(a[i] == 1){
                    cnt = cnt+1;
                }else{
                    if(cnt >= k){
                        long diff = cnt - k + 1;
                        ways = ways + (diff * (diff + 1)) / 2;
                    }
                    cnt = 0;
                }
            }
            if(cnt >= k){
                long diff = cnt - k + 1;
                ways = ways + (diff * (diff + 1)) / 2;
            }
            System.out.println(ways);
        }
        sc.close();
    }
}
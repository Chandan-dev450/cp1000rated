import java.util.*;

public class ArrayMerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            long[] longestSubarrayA = new long[2 * n + 1];
            long[] longestSubarrayB = new long[2 * n + 1];

            long cnt1 = 1;
            for(int i=1; i<n; i++){
                if(a[i] == a[i-1]){
                    cnt1++;
                }else{
                    longestSubarrayA[a[i-1]] = Math.max(longestSubarrayA[a[i-1]], cnt1);
                    cnt1 = 1;
                }
            }
            longestSubarrayA[a[n-1]] = Math.max(longestSubarrayA[a[n-1]], cnt1);

            cnt1 = 1;
            for(int i=1; i<n; i++){
                if(b[i] == b[i-1]){
                    cnt1++;
                }else{
                    longestSubarrayB[b[i-1]] = Math.max(longestSubarrayB[b[i-1]], cnt1);
                    cnt1 = 1;
                }
            }
            longestSubarrayB[b[n-1]] = Math.max(longestSubarrayB[b[n-1]], cnt1);

            long max_freq = Integer.MIN_VALUE;
            for(int i=0; i<=2*n; i++){
                max_freq = Math.max(max_freq, longestSubarrayA[i] + longestSubarrayB[i]);
            }
            System.out.println(max_freq);
        }
        sc.close();
    }
}
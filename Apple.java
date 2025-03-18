import java.util.*;

public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        
        long minDiff = Long.MAX_VALUE;
        for (int mask = 0; mask < (1 << n); mask++) {
            long subsetSum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subsetSum += arr[i];
                }
            }
            long diff = Math.abs((totalSum - subsetSum) - subsetSum);
            minDiff = Math.min(minDiff, diff);
        }
        
        System.out.println(minDiff);
    }
}

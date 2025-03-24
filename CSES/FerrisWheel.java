import java.util.Arrays;
import java.util.Scanner;

public class FerrisWheel {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] weights = new int[n];
            for (int i = 0; i < n; i++) {
                weights[i] = scanner.nextInt();
            }
            Arrays.sort(weights);
            int left = 0;
            int right = n - 1;
            int gondolas = 0;
            while (left <= right) {
                if (left == right) {
                    gondolas++;
                    break;
                }
                if (weights[left] + weights[right] <= x) {
                    left++;
                }
                right--;
                gondolas++;
            }
            System.out.println(gondolas);
        }
    }
}
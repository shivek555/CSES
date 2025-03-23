public class Apartment {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        int i = 0, j = 0, count = 0;
        while (i < n && j < m) {
            if (Math.abs(a[i] - b[j]) <= k) {
                count++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(count);
    }
}
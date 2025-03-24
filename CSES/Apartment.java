import java.io.*;
import java.util.*;

public class Apartment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out); // Fast output

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n]; // Applicants
        int[] b = new int[m]; // Apartments

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a); 
        Arrays.sort(b); 

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

        out.println(count);
        out.flush();
    }
}

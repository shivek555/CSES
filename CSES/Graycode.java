public class Graycode {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (1 << n); i++) {
            int gray = i ^ (i >> 1);
            sb.append(String.format("%" + n + "s", Integer.toBinaryString(gray)).replace(' ', '0')).append("\n");
        }
        System.out.print(sb);
    }
}
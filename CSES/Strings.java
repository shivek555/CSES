import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> permutations = getPermutations(input);
        List<String> sortedPermutations = new ArrayList<>(permutations);
        Collections.sort(sortedPermutations);
        System.out.println(sortedPermutations.size());
        for (String permutation : sortedPermutations) {
            System.out.println(permutation);
        }
    }

    public static Set<String> getPermutations(String input) {
        Set<String> permutations = new HashSet<>();
        permute(input.toCharArray(), 0, input.length() - 1, permutations);
        return permutations;
    }

    public static void permute(char[] chars, int left, int right, Set<String> permutations) {
        if (left == right) {
            permutations.add(new String(chars));
        } else {
            for (int i = left; i <= right; i++) {
                swap(chars, left, i);
                permute(chars, left + 1, right, permutations);
                swap(chars, left, i);
            }
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
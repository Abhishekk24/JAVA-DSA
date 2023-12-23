import java.util.*;

public class LongestPalindromeSubstring {
    static String search(String s) {
        String[] spp = s.split("");
        int n = spp.length;
        if (n == 0)
            return "";
        List<String> str = new ArrayList<>();
        String sp = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                sp = s.substring(i, j);
                if (!str.contains(sp))
                    str.add(sp);

            }

        }
        String check = checkPalindrome(str);

        return check;
    }

    private static String checkPalindrome(List<String> str) {
        String longest = "";

        for (String sub : str) {
            if (isPalindrome(sub) && sub.length() > longest.length()) {
                longest = sub;
            }
        }
        return longest;
    }

    private static boolean isPalindrome(String sub) {
        int l = 0;
        int r = sub.length() - 1;
        while (l < r) {
            if (sub.charAt(l) != sub.charAt(r)) {
                return false;

            }
            l++;
            r--;

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(search(s));
    }
}

import java.util.*;

public class IsSubsequence {

    static boolean isSubsequence(String s, String x) {
        HashSet<String> h1 = new HashSet<>();
        HashSet<String> h2 = new HashSet<>();
        int count = 0;
        char[] c1 = new char[s.length()];
        char[] c2 = new char[x.length()];

        for (int i = 0; i < s.length(); i++) {
            c1[i] = s.charAt(i);
        }
        for (int i = 0; i < x.length(); i++) {
            c2[i] = x.charAt(i);
        }

        for (int i = 0; i < c1.length; i++) {
            h1.add(String.valueOf(c1[i]));
        }
        for (int i = 0; i < c2.length; i++) {
            h2.add(String.valueOf(c2[i]));
        }
        for (int i = 0; i < c1.length; i++) {
            if (h2.contains(String.valueOf(c1[i]))) {
                count++;
            }
        }

        return (count == s.length());
    }

    public static void main(String[] args) {
        String s = "abc";
        String x = "ahbgdc";

        System.out.println(isSubsequence(s, x));
    }
}

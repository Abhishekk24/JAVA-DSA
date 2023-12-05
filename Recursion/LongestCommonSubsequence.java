import java.util.*;

public class LongestCommonSubsequence {
    static int longestCommonSubsequence(String text1, String text2) {
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < text1.length() && j < text2.length()) {
            if (text1.charAt(i) == text2.charAt(j)) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "ezupkr";
        String s2 = "ubmrapg";

        System.out.println(longestCommonSubsequence(s1, s2));
    }
}

public class minOperations {
    // static int check(String s) {
    //     if (s.length() == 0)
    //         return 0;

    // }

    static boolean checkalternate(String s) {
        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i - 1) == '1' && s.charAt(i) == '0') ||
                    (s.charAt(i - 1) == '0' && s.charAt(i) == '1')) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "0010";
        // System.out.println(check(s));
        System.out.println(checkalternate(s));
    }
}

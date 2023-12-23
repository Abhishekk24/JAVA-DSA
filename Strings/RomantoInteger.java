public class RomantoInteger {
    static int romans(String s) {
        int n = s.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            int v1 = value(c1);
            if (i + 1 < n) {
                char c2 = s.charAt(i + 1);
                int v2 = value(c2);
                if (v2 > v1) {
                    result += v2 - v1;
                    i++;
                } else
                    result += v1;
            } else
                result += v1;
        }
        return result;
    }

    // Function to get the integer value of a character
    private static int value(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }

    public static void main(String[] args) {
        String r = "XLV";
        System.out.println(romans(r));
    }
}

import java.util.*;

public class DecodeWays {
    static int decodeways(String s) {
        if (s.charAt(0) == '0')
            return 0;

        HashSet<String> str = new HashSet<>();
        StringBuilder result = new StringBuilder();
        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= s.length() - i; j++) {
                String substring = s.substring(j, j + i);
                if (!str.contains(substring)) {
                    str.add(substring);
                }
            }
        }

        for (String substring : str) {
            
                int num = Integer.parseInt(substring);
                if (num >= 1 && num <= 9) {
                    char letter = alphabet.charAt(num);
                    result.append(letter);
                } else if( num>=10 && num <=26) {
                    char letter = alphabet.charAt(num);

                    list.add(String.valueOf(letter));
                }
                else{
                    continue;
                }
            
        }
        list.add(String.valueOf(result));


        
        return list.size() ;
    }

    public static void main(String[] args) {
        String s = "12";
        System.out.println(decodeways(s));
    }
}

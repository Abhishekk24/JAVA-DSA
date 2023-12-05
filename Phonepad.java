import java.util.ArrayList;
import java.util.List;

public class Phonepad {
    private static final String[] KEYPAD_LETTERS = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        pad("23");
        System.out.println(pad("23"));
    }

    static List<String> pad(String digits) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(generateCombinations("", digits));
        return list;
        
    }

    static List<String> generateCombinations(String combination, String remainingDigits) {
        if (remainingDigits.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(combination);
            return list;
        }
        int digit = remainingDigits.charAt(0) - '0';
        String letters = KEYPAD_LETTERS[digit];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(generateCombinations(combination + ch, remainingDigits.substring(1)));
            
        }
        return list;
    }
}

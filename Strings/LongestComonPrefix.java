public class LongestComonPrefix {
    static String findString(String[] arr) {
        int min = Integer.MAX_VALUE;
        for (String word : arr) {
            min = Math.min(min, word.length());
        }
        StringBuilder str = new StringBuilder();  
        if (arr.length == 0) {
            return ""; // Empty array, return empty string
        }  

        for (int i = 0; i < min; i++) {
            char c = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].charAt(i) != c) {
                    return str.toString();
                    
                }
            }
            str.append(c);
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String[] arr = { "flower", "flow", "flight" };
        System.out.println(findString(arr));
    }
}

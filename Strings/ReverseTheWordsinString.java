import java.util.Arrays;

class ReverseTheWordsinString {
    static String reverse(String s) {
        String[] str = s.trim().split(" ");

        // for (int i = 0; i < n ; i++) {
        //     int start = i, end = n - 1 - i;

        //     // Swap words
        //     String temp = str[start];
        //     str[start] = str[end];
        //     str[end] = temp;
        // }

        // String modifiedSentence = addSpacesToWords(str);
        String ans ="";
        for(int i =str.length -1 ; i >0 ; i--){
            ans+= str[i] + " ";
        }
        return (ans+str[0]) ;
    }

    // private static String addSpacesToWords(String[] wordsArray) {
    //     StringBuilder modifiedSentence = new StringBuilder();

       
    //     for (String word : wordsArray) {
    //         modifiedSentence.append(word).append(" ");
    //     }

        
    //     if (modifiedSentence.length() > 0) {
    //         modifiedSentence.setLength(modifiedSentence.length() - 1);
    //     }

    //     return modifiedSentence.toString();
    // }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverse(s));
    }
}

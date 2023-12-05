public class RemoveWord {
    public static void main(String[] args) {
        String up = "AbhishekLikeappletoeaat";
        System.out.println(skipApple(up));
        
        // System.out.println(skip(up));
    }
    static String skip ( String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(ch =='a' || ch == 'A'){
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }

    }
    static String skipApple ( String up){
        if(up.isEmpty()){
            return "";
        }
        

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }

    }
}

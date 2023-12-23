public class myAtoi {
    static int myatoi(String s){
        String regex = "\\s*([+-]?\\d+)\\s*";
        
      
        String result = s.replaceAll(regex, "$1");

  
        if (result.isEmpty() ) {
            return 0;
        }

        return Integer.parseInt(result);
    }
    public static void main(String[] args) {
        String s = "number words    -42";
        System.out.println(myatoi(s));
    }
}

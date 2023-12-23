import java.util.*;
public class SimplifyPath {
    static String check(String path){
        if (path.length() == 0 || path.charAt(0) != '/') return "/";
        Stack<String> stack = new Stack<>();
       for(int i =0 ; i< path.length() ; i++){
        while(!stack.isEmpty()){

        }
        stack.push(i);
       }

    }
    public static void main(String[] args) {
        String path = "/home/";
    } 
}

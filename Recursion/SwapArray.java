
import java.util.*;
public class SwapArray {
   
    public static void main(String[] args) {
     
        String s = "I am , abhishek";
        char[] c = new char[s.length()];
        for(int i = 0 ; i < s.length() ;++i ){
            c[i]=s.charAt(i);
        }
        for(int i = 0; i< c.length; i++){
            if(Character.isUpperCase(c[i])){
              c[i] =  Character.toLowerCase(c[i]);
            }
            if(!Character.isLetterOrDigit(c[i])){
                c[i]='\0';
            }
        }
        
        System.out.println(c);
    }

}
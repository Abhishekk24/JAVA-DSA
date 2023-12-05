import java.util.Scanner;

public class Cons {
    
    public static void main(String[] args) {
        
       int n = 1203240324;
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int i;
       int count=0;

       while(n!=0){
        int rem = n % 10;
        if( rem == 2){
            count++;
        }
        n= n/10;
        
       }
       System.out.println("Number of time 2 occured"+ count);
       
      
       
       
    }
}

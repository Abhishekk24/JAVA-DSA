public class Prime{
    public static void main(String[] args) {
        int n = 8;
        if (n== 1){
            System.out.println("1 is not prime");

        }
        else if (n>2) {
            
            int x ;
            for( x= 2 ; x<= n/2 ; x++){
                if (n%x == 0){
                    System.out.println("Not Prime");
                    break;
            }
        }
        if (x > n / 2) {
            System.out.println("Prime");
        }
        } 
        else {
            System.out.println("Prime");
        } 
            
    
}
}
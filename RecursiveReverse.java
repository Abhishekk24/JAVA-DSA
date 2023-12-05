public class RecursiveReverse {
    public static void main(String[] args) {
        int n = 122;
        // fun(n);
        palin(n);
    }
    public static int fun (int n ) {
        if (n==0){
            return -1;
        }
        int m = n % 10;
        System.out.print(m+"");
        n = n / 10 ;

        return fun(n);
        
    }
    static boolean palin(int n){
        return n == fun(n);
    }
}

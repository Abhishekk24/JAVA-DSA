public class SumofN{
    static int function(int n){
        if(n==0){
            return 0;
        }
        return n + function(--n);
    }
    public static void main(String[] args) {
        int n = 5;
        int sum=0;
        System.out.println(function(n));
    }
}
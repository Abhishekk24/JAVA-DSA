import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        System.out.println("Enter the range of Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int i;
        for ( i = 0; i<n;i++){
            i = a+b;
            a=b;
            b=i;
            System.out.print(i + " ");

        }

    }
}

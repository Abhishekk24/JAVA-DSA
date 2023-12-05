public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int s= 0;
        int d = n;
        while (d > 0) {
            int r = d % 10;
            s = s + (r * r * r);
            d = d / 10;

    }
    if (s == n) {
        System.out.println(n + " is Armstrong Number");
}
else {
    System.out.println(n + " is not Armstrong Number");
}}}

package GeneralMath;

public class RepeatativeSumOfNumber {
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;
       while(n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            int lastD = n % 10;
            sum = sum + lastD;
            n = n / 10;
        }
        System.out.println(sum);
    }
}

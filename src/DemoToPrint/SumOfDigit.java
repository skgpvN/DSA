package DemoToPrint;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int sum=0;
        for (; a!=0;) {
            int x=a%10;
            sum=sum+x;
            a=a/10;
        }
        System.out.println(sum);
    }
}


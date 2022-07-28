package DemoToPrint;

import java.util.Scanner;
public class AddTwoNumbersPrintsumIsOddOrEvenAndReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
//        int sum = (a + b);
//        System.out.println(sum);
//        if (sum % 2 == 0){
//            System.out.println("Sum is even");
//        }
//        else{
//            System.out.println("Sum is odd");
//        }
//
//        int t=0;
//        while (sum!=0) {
//          int y=sum%10;
//           t=t*10+y;
//            sum=sum/10;
//        }
//        System.out.println(t);
        int y= sum(a,b);
           System.out.println(y);
        EvenOdd(y);
    }

    public static int sum(int a, int b) {
       int sum = a + b;
       return sum;
    }
    public static void EvenOdd(int x) {

        if (x % 2 == 0){
            System.out.println("Sum is even");
        }
        else{
            System.out.println("Sum is odd");
        }

    }
}

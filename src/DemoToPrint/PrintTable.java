package DemoToPrint;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int b=a*i;
            System.out.println(b);
        }

    }
}

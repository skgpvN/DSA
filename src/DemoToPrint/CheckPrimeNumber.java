package DemoToPrint;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
            int num = sc.nextInt();
            int j;
            int f=0;
            for(j=2; j<= Math.sqrt(num); j++){
                if(num%j==0){
                    f=f+1;
                }
            }
            if (f==0){
                System.out.println("Yes");
            }

            else{
                System.out.println("No");
            }
        }
    }


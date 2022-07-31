package Array;

import java.util.Scanner;

public class PrintingPOssiblePairFormingSumEqualToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n = sc.nextInt();
        for (int A = 1; A<=n; A++) {
            for(int B=1; B<=n; B++)

            if(A+B==n){
                count=count+1;
                
            }

        }
        System.out.println(count);

    }

}


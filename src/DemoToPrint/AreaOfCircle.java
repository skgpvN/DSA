package DemoToPrint;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r= (int) sc.nextFloat();
        float area = (float) ((r*r)*Math.PI);
        System.out.println(area);
    }
}

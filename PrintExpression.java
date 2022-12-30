
package buoi1;

import java.util.*;
public class PrintExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z,t;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        t=sc.nextInt();
        System.out.println(y+","+z+","+x+","+t);
        long tong = (long) x + y + z + t;
        long res = x - y + (long) z * t;
        System.out.println(tong);
        System.out.println(res);
    }
}

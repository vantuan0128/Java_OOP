
package buoi1;
import java.util.Scanner;
public class HamPow {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double x = sc.nextDouble();
        int m = (int) x;
        double y = sc.nextDouble();
        int n = (int) y;
        if(x != (double) m || y != (double) n){
            double res = Math.pow(x,y);
            System.out.printf("%.2f",res);
        }
        else System.out.println((long)Math.pow(x,y));
    }
}

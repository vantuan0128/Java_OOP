package buoi2;
import java.util.*;
public class MuaNuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a <= (double) b / 2){
            System.out.println(n * a);
        }
        else{
            if(n%2==0){
                System.out.println(n / 2 * b);
            }
            else{
                // So luong lit nuoc can mua la so le
                System.out.println((n-1) / 2 * b + a);
            }
        }
    }
}

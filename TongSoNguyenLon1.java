package OOP_2023;
import java.util.*;
import java.math.*;

public class TongSoNguyenLon1 {
    public static void main(String[] args) {
        BigInteger a, b;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            System.out.println(""+a.add(b));
        }
    }
}
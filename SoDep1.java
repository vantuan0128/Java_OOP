package OOP_2023;

import java.util.*;

public class SoDep1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            String s = sc.nextLine();
            if (thuannghich(s) && sochan(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean thuannghich(String s) {
        int a = 0;
        int b = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    public static boolean sochan(String s) {
        int a = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(a) != '0' && s.charAt(a) != '2' && s.charAt(a) != '4' && s.charAt(a) != '6' && s.charAt(a) != '8') {
                return false;
            }
            a++;
        }
        return true;
    }
}

package buoi15;

import java.util.*;

public class Chen {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(s);
        sb.insert(n,"28tech");
        System.out.println(sb.toString());
    }
}

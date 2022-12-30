
package buoi15;

import java.util.*;
public class SapXepCacTuTrongXau2 {
    public static boolean check(String s){
        StringBuilder t = new StringBuilder(s);
        return s.equals(t.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String[] a = s.split("\\s+");
        ArrayList<String> al = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for(String x : a){
            if(check(x)&&!hs.contains(x)){
                al.add(x);
                hs.add(x);
            }
        }
        //Ham sort co tinh stable nen giu lai thu tu xuat hien
        Collections.sort(al, new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                return t.length()-t1.length();
            }
        });
        for(String x : al){
            System.out.print(x+" ");
        }
    }
}

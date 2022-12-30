
import java.util.*;
public class TrungBinhCongNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        double sum = 0;
        int dem=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(soNguyenTo(a[i])){
                sum += a[i];
                dem++;
            }
        }
        System.out.format("%.3f", sum/dem);
    }
    public static boolean soNguyenTo(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0 && n!=2) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}

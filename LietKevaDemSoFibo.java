package buoi8;
import java.util.*;
public class LietKevaDemSoFibo {
    public static long []fb = new long[101];
    public static void xuli(){
        fb[0]=0;fb[1]=1;
        for(int i=2;i<=100;i++){
            fb[i] = fb[i-1] + fb[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long []a = new long[n];
        xuli();
        int dem=0,ok=0;
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        for(int i=0;i<n;i++){
            for(int j=0;j<=100;j++){
                if(a[i]==fb[j]){
                    System.out.print(a[i]+" ");
                    ok=1;
                    break;
                }
            }
        }
        if(ok==0) System.out.print("NONE");
    }
}
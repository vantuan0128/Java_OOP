
package SVMC;

import java.util.*;
public class S110 {
    public static void process(int [] a, int n){
        int [] b = a.clone();
        Arrays.sort(b);
        int first=0;
        int last=0;
        for(int i=0;i<n;i++){
            if(a[i] != b[i]){
                first=i+1;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(a[i] != b[i]){
                last=i+1;
                break;
            }
        }
        System.out.println(first+" "+last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            process(a,n);            
        }
    }
}

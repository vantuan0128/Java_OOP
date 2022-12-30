
package SVMC;

import java.util.*;

public class T1293 {
    public static int SNT(int n){
        if(n < 2) return 0;
        while(n > 0){
            if(n%10 != 2 && n%10 != 3 && n%10 != 5 && n%10 != 7) return 0;
            else n /= 10;
        }
        return 1;
    }
    public static int tim(int x, int a[], int n){
        for(int i=0;i<n;i++){
            if(a[i]==x) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int i,n=0;
        Scanner sc = new Scanner (System.in);
        int []a = new int[50001];
        int []b = new int[50001];
        Scanner li = new Scanner(sc.nextLine());
        while(li.hasNext()){
            int tmp = sc.nextInt();
            if(SNT(tmp)==1){
                i = tim(tmp,a,n);
                if(i==-1){
                    a[n] = tmp;
                    b[n]=1;
                    n++;
                }
                else b[i]++;  
            }
        }
        li.close();
        for(int j=0;j<n;j++) System.out.println(a[j]+" "+b[j]);
    }
}

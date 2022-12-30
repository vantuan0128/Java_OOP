/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trogiangbuoi3;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class GoldBachConjecture {
    public static int pr[] = new int[10000001];
    public static void sang(){
        for(int i=0;i<=10000000;i++){
            pr[i]=1;
        }
        pr[0]=pr[1]=0;
        for(int i=2;i<=Math.sqrt(10000000);i++){
            if(pr[i]==1){
                for(int j=i*i;j<=10000000;j+=i){
                    pr[j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sang();
        while(t-->0){
            int n = sc.nextInt();
            for(int i=2;i<=n/2;i++){
                if(pr[i]==1&&pr[n-i]==1){
                    System.out.print(i+" "+(n-i));
                    System.out.println();
                }
            }
        }
    }
}

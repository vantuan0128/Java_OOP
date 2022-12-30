/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trogiangbuoi3;

import java.util.*;

/**
 *
 * @author Tuấn
 */
public class KiemTraSNTvsNhieutestCase {
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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sang();
        while(t-->0){
            int n = sc.nextInt();
            if(pr[n]==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

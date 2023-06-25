/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSql12;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class TongHangTongCotMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int [][] a = new int[n][m];
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i< n; i++){
            int tongHang = 0;
            for(int j = 0; j < m; j++){
                tongHang += a[i][j];  
            }
            System.out.print(tongHang+" ");
        }
        System.out.println("");
        for(int i = 0; i < m; i++){
            int tongCot = 0;
            for(int j = 0; j < n; j++){
                tongCot += a[j][i];
            }
            System.out.print(tongCot+" ");
        }
        System.out.println("");
    }
}

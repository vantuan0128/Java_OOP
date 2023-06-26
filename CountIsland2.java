/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSql14;

/**
 *
 * @author Tuấn
 */
import java.util.*;

public class CountIsland2 {

    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static int[][] a = new int[100][100];
    public static int n, m;

    public static void loang(int i, int j) {
        a[i][j] = 0;
        for (int k = 0; k < 8; k++) {
            int inew = i + dx[k], jnew = j + dy[k];
            if (inew >= 0 && inew < n && jnew >= 0 && jnew < m && a[inew][jnew] == 1) {
                loang(inew, jnew);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    ++cnt;
                    loang(i, j);
                }
            }
        }
        System.out.println(cnt);
    }
}

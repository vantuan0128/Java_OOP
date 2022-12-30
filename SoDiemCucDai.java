package buoi14;
import java.util.*;
public class SoDiemCucDai {
    public static int n,m;
    public static int[] dx = {-1,-1,-1,0,0,1,1,1};
    public static int[] dy = {-1,0,1,-1,1,-1,0,1};
    public static int [][] a = new int[100][100];
    public static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //a[i][j]
                boolean check=true;
                for(int k=0;k<8;k++){
                    int i1 = i + dx[k];
                    int j1 = j + dy[k];
                    if(i1>=0 && i1<n && j1>=0 && j1<m && a[i1][j] >= a[i][j]){
                        check=false;
                        break;
                    }
                }
                if(check) ++cnt;
            }
        }
        System.out.println(cnt);
    } 
}

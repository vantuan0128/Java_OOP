import java.util.*;
public class LietKeCacGiaTriKhacNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int []mark = new int[1001];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
            mark[a[i]]++;
        }
        for(int i=0; i<n; i++){
            if(mark[a[i]]>=1){
                System.out.print(a[i]+" ");
                mark[a[i]]=0;
            }
        }
    }
}
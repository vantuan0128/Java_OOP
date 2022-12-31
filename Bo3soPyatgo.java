import java.util.ArrayList;
import java.util.Scanner;

public class Bo3soPyatgo{
    public static Long check(Long n,Long k){
        Long x = n*n+k*k;
        Long u  = (long) Math.sqrt(x);
        if(u*u == x) return u;
        return (long) 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            int ok=0;
            int n = sc.nextInt();
            ArrayList<Long> a = new ArrayList<Long>();
            for(int i=0;i<n;i++) a.add(sc.nextLong());
            a.sort(null);
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    if(check( a.get(i) , a.get(j) ) != 0  && a.contains(check(a.get(i), a.get(j)))){
                        System.out.println("YES");
                        ok=1;
                        break;
                    }
                }
            }
            if(ok == 0) System.out.println("NO");
        }
        sc.close();
    }
    
}
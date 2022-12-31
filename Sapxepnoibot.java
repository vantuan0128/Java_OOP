import java.util.Scanner;

public class Sapxepnoibot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a =new int[10000];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int tmp;
        boolean ok;
        for(int i=0;i<n;i++){
            ok=false;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    ok=true;
                }
            }
            if(ok==true){
                System.out.print("Buoc "+(i+1)+": ");
                for(int h=0;h<n;h++) System.out.print(a[h]+" ");
                System.out.println();
            }
        }
        sc.close();
    }
}

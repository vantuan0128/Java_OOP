import java.util.Scanner;

public class Diemcanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int [] a = new int[100000];
        while(t-->0){
            int n = sc.nextInt();
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            System.out.println(process(a,n));
        }
        sc.close();
    }
    public static int process(int a[] ,int n){
        long left_sum = 0;
        long total_sum = 0;
        for(int i=0;i<n;i++) total_sum += a[i]; //Tong tat ca
        for(int i=0;i<n;i++){
            total_sum -= a[i]; //Tong ben phai
            if(left_sum == total_sum) return i+1;
            else {
                left_sum += a[i]; //Tong trai
            }
        }
        return -1;
    }

}

package buoi15;
import java.util.*;
public class TanSuatXuatHienCuaKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int [] cnt = new int[256];
        //Dem tan suat
        for(char x : s.toCharArray()){
            cnt[x]++;
        }
        // Tan suat theo tu dien tang dan
        for(int i=0;i<256;i++){
            if(cnt[i]!=0){
                System.out.println((char)i+" "+cnt[i]);
            }
        }
        System.out.println();
        //Tan suat theo thu tu xuat hien
        for(char x : s.toCharArray()){
            if(cnt[x]!=0){
                System.out.println(x+" "+cnt[x]);
                cnt[x]=0;
            }
        }
    }
}

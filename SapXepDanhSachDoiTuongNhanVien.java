package OOP_2023;

import java.util.*;

public class SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien2> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String name = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String date = sc.nextLine();
            String dc = sc.nextLine();
            String mst = sc.nextLine();
            String hd = sc.nextLine();
            NhanVien2 x = new NhanVien2(i, name, gioiTinh, date, dc, mst, hd);
            list.add(x);
        }
        Collections.sort(list, new Comparator<NhanVien2>() {
            @Override
            public int compare(NhanVien2 o1, NhanVien2 o2) {
                //14/10/2002
                //15/8/1986
                String[] s1 = o1.getDate().split("/");
                //14,10,2002
                //15,8,1986
                String[] s2 = o2.getDate().split("/");
                String res1 = "", res2 = "";
                res1 += s1[2] + s1[1] + s1[0];
                //res1 = 20021014
                //res2 = 1986815
                res2 += s2[2] + s2[1] + s2[0];
                return res1.compareTo(res2);
            }
        });
        for (NhanVien2 x : list) System.out.println(x);
    }
}

class NhanVien2{
    private String id, name, gioiTinh, date, dc, mst, hd;

    public NhanVien2(int id, String name, String gioiTinh, String date, String dc, String mst, String hd) {
        this.id = String.format("%05d", id);
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.date = date;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.gioiTinh + " " + this.date + " " + this.dc + " " + this.mst + " " + this.hd;
    }
    
    public String getDate() {
        return date;
    }
}

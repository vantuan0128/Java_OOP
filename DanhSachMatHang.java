package OOP_Part1;

import java.util.*;

public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Product> l = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; ++i){
            String name = sc.nextLine();
            String donVi = sc.nextLine();;
            int mua = Integer.parseInt(sc.nextLine());
            int ban = Integer.parseInt(sc.nextLine());
            Product x = new Product(i, name, donVi, mua, ban);
            l.add(x);
        }
        Collections.sort(l, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getLoiNhuan() != o2.getLoiNhuan()) return o2.getLoiNhuan() - o1.getLoiNhuan();
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Product x : l) System.out.println(x);
    }
}

class Product{
    private String id, name, donVi;
    private int mua, ban;

    public Product(int id, String name, String donVi, int mua, int ban) {
        this.id = "MH" + String.format("%03d", id);
        this.name = name;
        this.donVi = donVi;
        this.mua = mua;
        this.ban = ban;
    }

    public String getName() {
        return name;
    }

    public int getLoiNhuan(){
        return this.ban - this.mua;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.donVi + " " + this.mua + " "  + this.ban + " " + this.getLoiNhuan();
    }
}
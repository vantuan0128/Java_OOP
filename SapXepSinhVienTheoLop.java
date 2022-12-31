
package OOP_Part2;

import java.util.*;

public class SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<Student3> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; ++i){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            Student3 s = new Student3(ma,ten,lop,mail);
            list.add(s);
        }
        Collections.sort(list, new Comparator<Student3>() {
            @Override
            public int compare(Student3 o1, Student3 o2) {
                if (o1.getLop().equals(o2.getLop())) return o1.getMa().compareTo(o2.getMa());
                return o1.getLop().compareTo(o2.getLop());
            }
        });
        for(Student3 x : list) System.out.println(x);
    }
}

class Student3{
    private String ma,ten,lop,mail;

    public Student3(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    
    public String getLop(){
        return this.lop;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma+" "+this.ten+" "+this.lop+" "+this.mail;
    }
}

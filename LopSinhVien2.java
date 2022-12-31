
package OOP_Part1;

import java.util.*;

public class LopSinhVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        String major = sc.nextLine();
        String date = sc.nextLine();
        float d = sc.nextFloat();
        if(date.charAt(1)=='/'){
            date = '0' + date;
        }
        if(date.charAt(4)=='/'){
            date = date.substring(0,3) + "0" + date.substring(3);
        }
        Student2 s = new Student2(name,major,date,d);
        s.in();
    }
}

class Student2{
    private String name, date, major;
    private float d;

    public Student2() {
        name=date=major="";
        d=0;
    }

    public Student2(String name, String major, String date, float d) {
        this.name = name;
        this.date = date;
        this.major = major;
        this.d = d;
    }
    
    public void in(){
        System.out.print("SV001 "+name+" "+major+" "+date+" ");
        System.out.format("%.1f",d);
    }
}

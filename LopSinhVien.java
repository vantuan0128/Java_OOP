package OOP_Part1;

import java.util.*;

public class LopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        String date = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        Student s = new Student(name,date,d1,d2,d3);
        s.in();
    }
}
class Student{
    private String name,date;
    private double d1,d2,d3;

    public Student(String name, String date, double d1, double d2, double d3) {
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public Student() {
    }
    
    public double tong(){
        return d1 + d2 + d3;
    }
    
    public String toString(){
        return name + " " + date + " " + this.tong();
    }
    
    public void in(){
        System.out.print(name+" "+ date+" ");
        System.out.format("%.1f",d1+d2+d3);
    }
}

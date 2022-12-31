import java.util.*;
public class BonDiemtrenmatphang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            
            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}

class Point3D{
    private int a,b,c;
    public Point3D(int a, int b, int c){
        this.a=a; this.b=b; this.c=c;
    }
    public Point3D TichCoHuong(Point3D m){
        return (new Point3D(m.b*this.c-this.b*m.c, -(m.a*this.c-this.a*m.c), m.a*this.b-this.a*m.b));
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        Point3D m = new Point3D(p2.a-p1.a,p2.b-p1.b,p2.c-p1.c);
        Point3D n = new Point3D(p3.a-p1.a,p3.b-p1.b,p3.c-p1.c);
        Point3D q = new Point3D(p4.a-p1.a,p4.b-p1.b,p4.c-p1.c);
        Point3D cohuong = n.TichCoHuong(m);
        if(q.a*cohuong.a + q.b*cohuong.b + q.c*cohuong.c == 0) return true;
        return false;   
    }
    @Override
    public String toString(){
        return this.a+" "+this.b+" "+this.c;
    }
}

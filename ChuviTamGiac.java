import java.util.*;
public class ChuviTamGiac {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            double kc1 = a.distance(b), kc2=b.distance(c), kc3=a.distance(c);
            if(kc1+kc2<=kc3||kc1+kc3<=kc2||kc2+kc3<=kc1){
                System.out.println("INVALID");
            }
            else{
                System.out.format("%.3f\n",kc1+kc2+kc3);
            }
        }
    }
}

class Point{
    private double x,y;
    public Point(){
        x=y=0;
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Point(Point p){
        this.x=p.x;
        this.y=p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(secondPoint.x-this.x,2) + Math.pow(secondPoint.y-this.y,2));
    }
    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.x-p1.x,2) + Math.pow(p2.y-p1.y,2));
    }
    public String toString(){
        return "("+x+" "+y+")";
    }
}

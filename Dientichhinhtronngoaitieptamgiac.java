import java.util.*;
public class Dientichhinhtronngoaitieptamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            double ab=a.distance(b), ac=a.distance(c), bc=b.distance(c);
            if(ab+ac<=bc || ab+bc<=ac || ac+bc<=ab){
                System.out.println("INVALID");
            }
            else{
                double p = (ab+ac+bc)/2;
                double dt = Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
                double r = ab*bc*ac/(4*dt);
                System.out.printf("%.3f\n",Math.PI*r*r);
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


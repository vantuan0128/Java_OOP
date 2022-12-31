package OOP_Part1;

import java.util.*;

public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Time> l = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i){
            Time time = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            l.add(time);
        }
        Collections.sort(l, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return o1.get() - o2.get();
            }
        });
        for (Time x : l) System.out.println(x);
    }
}

class Time{
    private int hour, min, sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int get(){
        return hour * 3600 + min * 60 + sec;
    }

    public String toString() {
        return this.hour + " " + this.min + " " + this.sec;
    }
}
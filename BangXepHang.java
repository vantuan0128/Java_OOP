package OOP_2023;

import java.util.*;

public class BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <SinhVien7> list = new ArrayList<>();
        for (int i = 0; i < n; ++i){
            String name = sc.nextLine();
            String[] s = sc.nextLine().split(" ");
            int correct = Integer.parseInt(s[0]);
            int submit = Integer.parseInt(s[1]);
            SinhVien7 x = new SinhVien7(name, correct, submit);
            list.add(x);
        }
        Collections.sort(list, new Comparator<SinhVien7>() {
            @Override
            public int compare(SinhVien7 o1, SinhVien7 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Collections.sort(list, new Comparator<SinhVien7>() {
            @Override
            public int compare(SinhVien7 o1, SinhVien7 o2) {
                if (o1.getCorrect() != o2.getCorrect()) return o2.getCorrect() - o1.getCorrect();
                return o1.getSubmit() - o2.getSubmit();
            }
        });
        for (SinhVien7 x : list) System.out.println(x);
    }
}

class SinhVien7{
    private String name;
    private int correct, submit;

    public SinhVien7(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public int getCorrect() {
        return correct;
    }

    public int getSubmit() {
        return submit;
    }

    @Override
    public String toString() {
        return this.name + " " + this.correct + " " + this.submit;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi15;

import buoi12.main;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tuấn
 */
public class SapXepGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <GiangVien> l = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=t;i++){
            GiangVien a = new GiangVien(sc.nextLine(), sc.nextLine());
            a.setId(i);a.setVtnganh();a.setTen();
            l.add(a);
        }
        Collections.sort(l,new Comparator<GiangVien>
        () {
            @Override
            public int compare(GiangVien t, GiangVien t1) {
                if(t1.getTen().compareTo(t.getTen()) != 0)  return t1.getName().compareTo(t.getName());
                return t.getId().compareTo(t1.getId());
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        for(GiangVien x :l){
            System.out.println(x);
        }
    }
}
class GiangVien{
    private String name,id,nganh,vtnganh,ten;

    public GiangVien(String name, String nganh) {
        this.name = name;
        this.nganh = nganh;
        this.id="";
        this.vtnganh="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(int cnt) {
        this.id ="GV"+ String.format("%02d",cnt);
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setVtnganh() {
        String []res = nganh.split(" ");
        for(int i=0;i<res.length;i++){
            this.vtnganh += String.valueOf(res[i].charAt(0));
        }
        this.vtnganh = this.vtnganh.toUpperCase();
    }
    public void setTen(){
        String[] res =  name.split(" ");
        
        this.ten = res[res.length-1];
    }

    public String getTen() {
        return ten;
    }
    
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.vtnganh;
    }
}
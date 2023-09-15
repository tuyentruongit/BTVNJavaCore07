package Exercise6;

import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
       Students6[] sinhVien = enterInfor();
       printInfor(sinhVien);


//       Nhap lai sinh vien bat ki
       nhapLai(sinhVien);
       printInfor(sinhVien);


       //Xoa 1 sinh vien bat ki
        System.out.println("---------------");
       Students6[] sinhVien2 = delete(sinhVien);
        printInfor(sinhVien2);
    }

    public static void printInfor(Students6[] sinhVien) {
        for (int i = 0; i < sinhVien.length; i++) {
            System.out.println(sinhVien[i]);
        }
    }

    public static Students6[] enterInfor() {
        System.out.println("Nhập số lượng sinh viên ");
        int n = new Scanner(System.in).nextInt();

        Students6 []  sinhVien = new Students6[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tinh sinh viên thứ "+(i+1));
            sinhVien[i]=new Students6();
            sinhVien[i].studentInformation();
        }
        return sinhVien;
    }
    public static void nhapLai(Students6[] sinhVien ){
        int a = new Random().nextInt(10);
        System.out.println("Nhập lại thông tin sinh thứ " + (a+1));
        sinhVien[a].studentInformation();
    }
    public static Students6 [] delete(Students6[] sinhVien){
        Students6 [] sinhvien2 = new Students6[sinhVien.length-1];
        int n = new Random().nextInt(10);
        for (int i = 0; i < n; i++) {
            sinhvien2[i]=sinhVien[i];
        }
        for (int j = n-1; j < sinhvien2.length ; j++) {
            sinhvien2[j]=sinhVien[j+1];
        }
        return sinhvien2;

    }



}

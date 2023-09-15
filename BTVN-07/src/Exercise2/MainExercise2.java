package Exercise2;

import Exercise1.Students;

import java.util.*;

public class MainExercise2 {
    public static void main(String[] args) {
        Students2[] sinhVien = enterInforimaiton();
        printInformation(sinhVien);
    }
    public static Students2[] enterInforimaiton() {
        System.out.print("Nhập số lượng sinh viên : ");
        int number = new Scanner(System.in).nextInt();
        Students2[] mangSv = new Students2[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Nhập thông tin của sinh viên " + (i + 1));
            mangSv[i] = new Students2();
            mangSv[i].studentInformation();
        }
        return mangSv;
    }
    public static Comparator<Students2> StudentCom = new Comparator<Students2>() {
        public int compare(Students2 u1, Students2 u2) {
            return u1.fullName.compareTo(u2.fullName);
        }
    };
    public static void printInformation(Students2[] mangSv) {
        Arrays.sort(mangSv, StudentCom);
        for (int i = 0; i < mangSv.length; i++) {
            System.out.println("Thông tin vinh viên thứ " + (i + 1) + ":" + mangSv[i]);
        }
    }

}







package Exercise7;



import java.util.Random;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Students7[] sinhVien = enterInfor();
    }
    public static void printInfor(Students7[] sinhVien) {
        for (int i = 0; i < sinhVien.length; i++) {
            System.out.println(sinhVien[i]);
        }
    }

    public static Students7 [] enterInfor() {
        System.out.println("Nhập số lượng sinh viên ");
        int n = new Scanner(System.in).nextInt();

        Students7 []  sinhVien = new Students7[n];

//        sinhVien[0]=new Students7();
        sinhVien[0].studentInformation();
        for (int i = 1; i <n; i++) {
            System.out.println("Nhập mã sinh viên");
            int idStudents = sinhVien[0].idStudents++;

            System.out.println("Nhập tên sinh viên");
            String fullName = new Scanner(System.in).nextLine();

            System.out.println("Nhập địa chỉ của sinh viên");
            String address = new Scanner(System.in).nextLine();

            System.out.println("Nhập giới tính của sinh viên");
            String gender = new Scanner(System.in).nextLine();

            System.out.println("Nhập điểm trung bình của sinh  viên");
            Float gpa = new Scanner(System.in).nextFloat();

            System.out.println("Nhập khóa của sinh viên");
            String faculty = new Scanner(System.in).nextLine();
            sinhVien[i]=new Students7(idStudents,fullName,address,gender,gpa,faculty);

        }

        return sinhVien;
    }


}

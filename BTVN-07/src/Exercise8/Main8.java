package Exercise8;


import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Students8[] sinhVien = enterInfor();
    }
    public static void printInfor(Students8[] sinhVien) {
        for (int i = 0; i < sinhVien.length; i++) {
            System.out.println(sinhVien[i]);
        }
    }

    public static Students8 [] enterInfor() {
        System.out.println("Nhập số lượng sinh viên ");
        int n = new Scanner(System.in).nextInt();

        Students8[] sinhVien = new Students8[n];


        for (int i = 1; i < n; i++) {
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
            sinhVien[i] = new Students8(idStudents, fullName, address, gender, gpa, faculty);

        }
        return sinhVien;
    }
}

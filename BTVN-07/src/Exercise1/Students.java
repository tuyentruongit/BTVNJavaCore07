package Exercise1;

import java.util.Scanner;

public class Students {
    public int idStudents;
    public String fullName;

    public String Class;
    public String lockUp;

    @Override
    public String toString() {
        return "Students2{" +
                "idStudents=" + idStudents +
                ", fullName='" + fullName + '\'' +
                ", Class='" + Class + '\'' +
                ", lockUp='" + lockUp + '\'' +
                '}';
    }

    public void studentInformation(){
        System.out.println("Nhập mã sinh viên");
        idStudents= new Scanner(System.in).nextInt();

        System.out.println("Nhập tên sinh viên");
        fullName= new Scanner(System.in).nextLine();

        System.out.println("Nhập khóa sinh viên");
        Class= new Scanner(System.in).nextLine();

        System.out.println("Nhập khóa sinh viên");
        lockUp= new Scanner(System.in).nextLine();


    }
}

package Exercise6;

import java.util.Scanner;

public class Students6 {
    public int idStudents;
    public String fullName;
    public String address;
    public String gender;
    public float gpa ;
    public String faculty;

    @Override
    public String toString() {
        return "Students6{" +
                "idStudents=" + idStudents +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                ", faculty='" + faculty + '\'' +
                '}';
    }
    public void studentInformation(){
        System.out.println("Nhập mã sinh viên");
        idStudents= new Scanner(System.in).nextInt();

        System.out.println("Nhập tên sinh viên");
        fullName= new Scanner(System.in).nextLine();

        System.out.println("Nhập địa chỉ của sinh viên");
        address= new Scanner(System.in).nextLine();

        System.out.println("Nhập giới tính của sinh viên");
        gender= new Scanner(System.in).nextLine();

        System.out.println("Nhập điểm trung bình của sinh  viên");
        gpa = new Scanner(System.in).nextFloat();

        System.out.println("Nhập khóa của sinh viên");
        faculty= new Scanner(System.in).nextLine();


    }
}

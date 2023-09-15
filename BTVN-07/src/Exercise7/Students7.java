package Exercise7;

import java.util.Scanner;

public class Students7 {
    public static int nextId = 10000;
    public int idStudents;
    public String fullName;
    public String address;
    public String gender;
    public float gpa ;
    public String faculty;

//    public Students7(int idStudents) {
//        this.idStudents = nextId++;
//    }
        public Students7(int idStudents, String fullName, String address, String gender, float gpa, String faculty) {
        this.idStudents = nextId++;
        this.fullName = fullName;
        this.address = address;
        this.gender = gender;
        this.gpa = gpa;
        this.faculty = faculty;
    }

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
    public void studentInformation() {
        System.out.println("Nhập mã sinh viên");
        idStudents= new Scanner(System.in).nextInt();

        System.out.println("Nhập tên sinh viên");
        fullName = new Scanner(System.in).nextLine();

        System.out.println("Nhập địa chỉ của sinh viên");
        address = new Scanner(System.in).nextLine();

        System.out.println("Nhập giới tính của sinh viên");
        gender = new Scanner(System.in).nextLine();

        System.out.println("Nhập điểm trung bình của sinh  viên");
        gpa = new Scanner(System.in).nextFloat();

        System.out.println("Nhập khóa của sinh viên");
        faculty = new Scanner(System.in).nextLine();
    }



}

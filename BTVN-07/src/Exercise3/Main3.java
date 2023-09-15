package Exercise3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Nhập chiều dài hình chữ nhật ");
        double height = new Scanner(System.in).nextInt();

        System.out.println("Nhập chiều rộng hình chữ nhật ");
        double width = new Scanner(System.in).nextInt();

        System.out.println("Nhập màu sắc hình chữ nhật ");
        String color   = new Scanner(System.in).nextLine();

        Ractangle hcn = new Ractangle(height,width,color);


        print(hcn);


    }
    public static void print (Ractangle hcn){
        System.out.println("Width = "+hcn.width);
        System.out.println("Height = "+hcn.height);
        System.out.println("Color = "+hcn.color);
        System.out.println("Diện tích hình chữ nhật là " + hcn.findArea());
        System.out.println("Chu vi hình chữ nhật là " + hcn.findPerimeter());
    }
}

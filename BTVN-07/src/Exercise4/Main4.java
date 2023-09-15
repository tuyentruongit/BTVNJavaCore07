package Exercise4;

import Exercise3.Ractangle;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        MyPoint[] point = input();
        printMyPoint(point);
        printDistance(point);


    }
    public static MyPoint[] input (){
        System.out.print("Nhập số lượng Point :");
        int n = new Scanner(System.in).nextInt();

        MyPoint[] point = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tọa độ điểm thứ " +(i+1));


            System.out.print("X"+(i+1)+"=");
            double x = new Scanner(System.in).nextDouble();
            System.out.print("Y"+(i+1)+"=");
            double y = new  Scanner(System.in).nextDouble();
            point[i]=new MyPoint(x,y);
        }
        return point;
    }
    public static void printMyPoint(MyPoint[] points){
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
    }
    public static void printDistance(MyPoint[] point){
        double distancemax=0;
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint();
        int a = 0;
        int b = 0;
        for (int i = 0; i < point.length; i++) {
            for (int j = 0; j < point.length ; j++) {
                double distance = point[i].distance(point[j]);
                if (distance>distancemax){
                    distancemax=distance;
                    point1=point[i];
                    point2=point[j];
                    a=i+1;
                    b=j+1;
                }
            }
        }
        System.out.println("2 Điểm có khoảng cách lớn nhất = "+distancemax);
        System.out.println("Điểm thứ " + a + ":" + point1);
        System.out.println("Điểm thứ " + b + ":" + point2);
    }

}

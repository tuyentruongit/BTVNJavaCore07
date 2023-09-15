package Exercise3;

import java.util.Scanner;

public class Ractangle {
    public double width;
    public double height;
    public String color;


    public Ractangle() {
        this.width=1;
        this.height=1;
    }

    public Ractangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.width=height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){

    }
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "Ractangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}

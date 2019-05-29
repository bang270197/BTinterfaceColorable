package com.company;

public class Main {

    public static void main(String[] args) {
Shape[] shapes =new Shape[3];
shapes[0]=new Circle();
shapes[1]=new Rectangle();
shapes[2]=new Square();
Circle circle=(Circle) shapes[0] ;
        System.out.println(circle.getArea());
        Square square =(Square) shapes[2];
        square.howToColor();
    }
}

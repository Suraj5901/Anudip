package com.Anudip.Program_2nd_Aug;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 10);
        Rectangle rectangle = new Rectangle("Rectangle", 20, 30);

        circle.draw();
        rectangle.draw();
    }
}
package com.Anudip.Program_2nd_Aug;





public abstract class Shape {
    protected String name;
    protected double area;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public abstract void draw();
}









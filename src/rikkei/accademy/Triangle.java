package rikkei.accademy;

public class Triangle extends Shape{
    private double side1=0.0;
    private double side2=0.0;
    private double side3=0.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }

    public double getArea(){
        double area = this.getPerimeter()*(this.getPerimeter()-this.side1)*(this.getPerimeter()-this.side2)*(this.getPerimeter()-this.side3);
        return Math.pow(area,0.5);
    }

    @Override
    public String toString() {
        return "Triangle is : "+
                super.toString()+
                ", lengths of sides : " +
                " " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                ", Perimeter = "+(this.getPerimeter()>0?this.getPerimeter():" ? ")+
                ", Area = "+(this.getArea()>0?this.getArea():" ? ")+
                '}';
    }
}

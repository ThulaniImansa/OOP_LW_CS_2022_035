package LW01;


import java.util.Scanner;

class Circle {
    double radius;
    Circle(double rad){
        radius=rad;
    }

    public double computeArea(){
        double area;
        area=Math.PI*radius*radius;
        return area;
    }
    public double computeCircumference(){
        double circumference;
        circumference=2*Math.PI*radius;
        return circumference;
    }
}

public class Q05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the outer circle radius: ");
        double outerRadius = scanner.nextDouble();
        System.out.println("Enter the inner circle radius: ");
        double innerRadius = scanner.nextDouble();

        Circle outerCircle = new Circle(outerRadius);
        Circle innerCircle = new Circle(innerRadius);

        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();
        double shadedArea = outerCircleArea - innerCircleArea;

        System.out.println("Shaded Area: " + shadedArea);

        double outerCircumference = outerCircle.computeCircumference();
        double innerCircumference = innerCircle.computeCircumference();
        double shadedCircumference = outerCircumference - innerCircumference;
        System.out.println("Shaded Circumference: " + shadedCircumference);
    }
}




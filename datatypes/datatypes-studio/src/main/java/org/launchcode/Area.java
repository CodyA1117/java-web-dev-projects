package org.launchcode;
import java.util.Scanner;
import studios.areaofacircle.Circle;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius");
        Double radiusOfCircle = input.nextDouble();

        double area = Circle.getArea(radiusOfCircle);


//        double areaOfCircle = 3.14 * radiusOfCircle * radiusOfCircle;
        System.out.println("The area of a circle is:" + area);
    }
}

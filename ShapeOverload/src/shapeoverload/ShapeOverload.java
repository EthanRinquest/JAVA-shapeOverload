/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeoverload;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class ShapeOverload {

    public double CalcArea(double base, double height, String x) {
        return (0.5 * base * height);
    }

    public double CalcArea(double radius) {
        return 22 / 7 * (radius * radius);
    }

    public double CalcArea(double length, double width){
        return length * width;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height;
        double base;
        double length;
        double width;
        double radius;

        System.out.println("Enter heigth");
        height = input.nextDouble();
        System.out.println("Enter base");
        base = input.nextDouble();
        System.out.println("Enter length");
        length = input.nextDouble();
        System.out.println("Enter width");
        width = input.nextDouble();
        System.out.println("Enter radius");
        radius = input.nextDouble();
        
        ShapeOverload shape = new ShapeOverload();
        System.out.println("Triangle area: " +shape.CalcArea(base,height));
        System.out.println("Circle area: " +shape.CalcArea(radius));
        System.out.println("Rectangel area: " +shape.CalcArea(length,width));
    }

}

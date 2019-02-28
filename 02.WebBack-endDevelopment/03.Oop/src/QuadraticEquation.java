import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double newA, double newB, double newC) {
        this.a = newA;
        this.b = newB;
        this.c = newC;
    }

    public static void main(String[] args) {
        QuadraticEquation f1 = new QuadraticEquation(1, 2, -3);
        if (f1.getDiscriminant() > 0) {
            System.out.println("r1: " + f1.getRoot1() + " and r2: " + f1.getRoot2());
        } else if (f1.getDiscriminant() == 0) {
            System.out.println("The method has a unique description: " + f1.getRoot1());
        } else {
            System.out.println("the equation has no roots");
        }
    }


    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    double getRoot2() {
        return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }
}

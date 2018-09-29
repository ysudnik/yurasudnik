package app;

import java.util.Scanner;

public class Application {
    private double a,b;

    public Application() {
    }

    public Application(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую переменную:");
        a = scanner.nextDouble();
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вторую переменную:");
        b = scanner.nextDouble();
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}

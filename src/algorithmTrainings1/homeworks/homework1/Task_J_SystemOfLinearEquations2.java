package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_J_SystemOfLinearEquations2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        System.out.println(solve(a, b, c, d, e, f));
        scanner.close();
    }

    public static String solve(double a, double b, double c, double d, double e, double f) {
        double delta = a * d - c * b;
        double delta1 = e * d - f * b;
        double delta2 = a * f - c * e;
        if (delta != 0) {
            return "2 " + delta1 / delta + " " + delta2 / delta;
        }
        if (delta1 != 0 || delta2 != 0) {
            return "0";
        }
        if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0) {
            return "5";
        }
        if (a != 0 && b != 0) {
            return "1 " + (-a / b) + " " + (e / b);
        }
        if (c != 0 && d != 0) {
            return "1 " + (-c / d) + " " + (f / d);
        }
        if (a != 0) {
            return "3 " + (e / a);
        }
        if (b != 0) {
            return "4 " + (e / b);
        }
        if (c != 0) {
            return "3 " + (f / c);
        }
        if (d != 0) {
            return "4 " + (f / d);
        }
        return "0";
    }

}

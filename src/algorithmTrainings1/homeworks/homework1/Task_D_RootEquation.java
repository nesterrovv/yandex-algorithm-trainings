package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_D_RootEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        solve(a, b, c);
        scanner.close();
    }

    public static void solve(int a, int b, int c) {
        if (c < 0) {
            System.out.println("NO SOLUTION");
        } else if (a == 0) {
            System.out.println(Math.pow(c, 2) == b ? "MANY SOLUTIONS" : "NO SOLUTION");
        } else {
            double x = (Math.pow(c, 2) - b) / a;
            System.out.println(x % 1 == 0 ? (int) x : "NO SOLUTION");
        }
    }

}

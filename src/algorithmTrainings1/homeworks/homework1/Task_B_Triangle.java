package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_B_Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(solve(a, b, c));
        scanner.close();
    }

    public static String solve(int a, int b, int c) {
        int longest = Math.max(Math.max(a, b), c);
        return longest < a + b + c - longest ? "YES" : "NO";
    }
}

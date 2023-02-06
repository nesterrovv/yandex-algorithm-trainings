package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_I_IfCastlePrisoner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(solve(a, b, c, d, e));
        scanner.close();
    }

    public static String solve(int a, int b, int c, int d, int e) {
        int minBrickEdge = Math.min(a, Math.min(b, c));
        int middleBrickEdge = Math.min(a, c);
        if (minBrickEdge == a) {
            middleBrickEdge = Math.min(b, c);
        } else if (minBrickEdge == b) {
            middleBrickEdge = Math.min(a, c);
        }
        int minHoleEdge = Math.min(d, e);
        int maxHoleEdge = d + e - minHoleEdge;
        return minHoleEdge >= minBrickEdge && maxHoleEdge >= middleBrickEdge ? "YES" : "NO";
    }

}

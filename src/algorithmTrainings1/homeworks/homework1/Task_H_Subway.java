package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_H_Subway {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(solve(a,b,n,m));
        scanner.close();
    }

    public static String solve(int a, int b, int n, int m) {
        int maxFirstTime = n + a * (n - 1) + 2 * a;
        int maxSecondTime = m + b * (m - 1) + 2 * b;
        int minFirstTime = maxFirstTime - 2 * a;
        int minSecondTime = maxSecondTime - 2 * b;
//        System.out.println("First: [" + minFirstTime + "; " + maxFirstTime + "]");
//        System.out.println("Second: [" + minSecondTime + "; " + maxSecondTime + "]");
        // finally: find the intersection of these intervals
        int start = Math.max(minFirstTime, minSecondTime);
        int end = Math.min(maxFirstTime, maxSecondTime);
        if (end < start) {
            return "-1";
        }
        return start + " " + end;
    }

}

package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_E_Ambulance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p = scanner.nextInt();
        int m = scanner.nextInt();
        int xk = getNumberOfFlatsOnFloor(k, p, n, m);
        System.out.println("xp");
        int xp = getEntrance(xk, n, k1);
        int xn = getFloor(xp, n, xk, k1);

        System.out.println("xp2");
        int xp2 = getEntrance(xk, n, k);
        int xn2 = getFloor(xp2, n, xk, k);

        //System.out.println(xp + " " + xn);
        if (p == xp2 && m == xn2) {
            System.out.println(xp + " " + xn);
        } else {
            System.out.println("-1 -1");
        }
        System.out.println("Expected: " + p + " " + m);
        System.out.println("Check res: " + xp2 + " " + xn2);
        scanner.close();
    }

    public static int getNumberOfFlatsOnFloor(int k, int p, int n, int m) {
        double res = (double) k / (p * n - n + m);
        if (res % 1 == 0) {
            System.out.println("нацело: " + res);
            System.out.println("num of flats in floor " + (int) res);
            return (int) res;
        } else {
            System.out.println("ненацело: " + res);
            System.out.println("num of flats in floor " + (int) res + 1);
            return (int) res + 1;
        }
    }

    public static int getEntrance(int x, int n, int k) {
        int entrance = 1;
        while (k > entrance * x * n) {
            int startFloor = (entrance-1) * n * x + x * (entrance - 1);
            int endFloor = startFloor + x;
            if (startFloor < x && x <= endFloor) System.out.println("good");
            entrance++;
        }
        System.out.println("Entrance " + entrance);
        return entrance;
    }

    public static int getFloor(int p, int n, int x, int k) {
        int currentFloor = 1;
        while (currentFloor <= n) {
            int startFloor = (p-1) * n * x + x * (currentFloor - 1);
            int endFloor = startFloor + x;
            if (k > startFloor && k <= endFloor) {
                return currentFloor;
            }
            currentFloor++;
        }
        return 0;
    }



}

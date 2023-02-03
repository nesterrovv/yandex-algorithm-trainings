package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_F_PlacementOfLaptops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        System.out.println(solve(a1, b1, a2, b2));
        scanner.close();
    }

    public static String solve(int a1, int b1, int a2, int b2) {
        int area1 = (a1 + b2) * Math.max(a2, b1);
        int area2 = (b1 + a2) * Math.max(a1, b2);
        int area3 = (a1 + a2) * Math.max(b1, b2);
        int area4 = (b1 + b2) * Math.max(a1, a2);
        int area5 = (a1 + b1) * Math.max(a2, b2);
        //int area6 = (a2 + b2) * Math.max(a1, b1); - can be deleted as variable because not used.
        // But important for understating
        int minArea = Math.min((Math.min(area1, area2)), Math.min(area3, area4));
        if (minArea == area1) {
            return (a1 + b2) + " " + Math.max(a2, b1);
        }
        if (minArea == area2) {
            return (b1 + a2) + " " + Math.max(a1, b2);
        }
        if (minArea == area3) {
            return (a1 + a2) + " " +  Math.max(b1, b2);
        }
        if (minArea == area4) {
            return (b1 + b2) + " " + Math.max(a1, a2);
        }
        if (minArea == area5) {
            return (a1 + b1) + " " + Math.max(a2, b2);
        }
        return (a2 + b2) + " " + Math.max(a1, b1); // it's area 6
    }

}

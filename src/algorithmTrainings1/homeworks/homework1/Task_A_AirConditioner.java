package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_A_AirConditioner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] temperatures = scanner.nextLine().split(" ");
        String mood = scanner.next();
        int tRoom = Integer.parseInt(temperatures[0]);
        int tCond = Integer.parseInt(temperatures[1]);
        System.out.println(solve(tRoom, tCond, mood));
        scanner.close();
    }

    public static int solve(int tRoom, int tCond, String mood) {
        switch (mood) {
            case "auto":    return tCond;
            case "heat":    return Math.max(tRoom, tCond);
            case "freeze":  return Math.min(tRoom, tCond);
            default:        return tRoom;
        }
    }
}

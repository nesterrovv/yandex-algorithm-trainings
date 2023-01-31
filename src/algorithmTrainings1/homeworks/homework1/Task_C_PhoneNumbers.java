package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_C_PhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String addedNumber = modify(scanner.nextLine());
        String first = modify(scanner.nextLine());
        String second = modify(scanner.nextLine());
        String third = modify(scanner.nextLine());
        System.out.println(addedNumber.equals(first) ? "YES" : "NO");
        System.out.println(addedNumber.equals(second) ? "YES" : "NO");
        System.out.println(addedNumber.equals(third) ? "YES" : "NO");
        scanner.close();
    }

    public static String modify(String initial) {
        String updated = initial.replace("(", "").replace(")", "")
                .replace("+", "").replace("-", "");
        String updated2 = updated;
        if(updated.length() == 11) {
            updated2 = updated.substring(1);
        }
        String updated3 = updated2;
        if (updated2.length() != 10) {
            updated3 = "495" + updated2;
        }
        return updated3;
    }
}

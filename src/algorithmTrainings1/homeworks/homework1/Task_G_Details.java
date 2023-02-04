package algorithmTrainings1.homeworks.homework1;

public class Task_G_Details {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println(solve(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    public static int solve(int n, int k, int m) {
        if (k < m) return 0;
        int metalLeft = n;
        int details = 0;
        while (metalLeft >= k) {
            int preDetailsAmount = metalLeft / k;
            metalLeft = metalLeft % k;
            details += (k / m) * preDetailsAmount ;
            metalLeft += (k % m) * preDetailsAmount;
        }
        return details;
    }

}
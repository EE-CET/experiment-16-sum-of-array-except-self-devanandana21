import java.util.Scanner;

public class SumExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.print((totalSum - arr[i]) + " ");
        }
    }
}

import java.util.Scanner;

public class IcecreamParlor {
    private static void solver(int m, int n, int[] arr) {
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == m) {
                    System.out.print(i + 1);
                    System.out.print(" ");
                    System.out.print(j + 1);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            solver(m, n, arr);
    
        }
    }
}

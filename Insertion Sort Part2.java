import java.util.Scanner;

public class Insertion {
    static void insertion(int[] arr,int n){
        for (int i=1;i<n;i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        insertion(arr,n);
    }
}

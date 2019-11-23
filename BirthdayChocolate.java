import java.util.Scanner;

public class BirthdayChocolate {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        for(int i=0;i<=n-m;i++){
            int sum =0;
            int k=i;
            int j =1;
            while (j <= m) {
                sum = sum + arr[k];
                k++;
                j++;
            }
                if(sum == d){
                    count++;
                }
            }
        System.out.println(count);
    }
}

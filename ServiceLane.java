import java.util.Scanner;

public class ServiceLane {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int c =0;c<t;c++){
            int i = in.nextInt();
            int j = in.nextInt();
            int min =arr[i];
            for(int a = i;a<=j;a++){
                if(arr[a]<min){
                    min =arr[a];
                }
            }
            System.out.println(min);
        }
    }
}

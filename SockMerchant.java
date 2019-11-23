import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int scount=0;
        for(int i=0;i<n;i++){
            int count =1;
            for(int j =i+1;j<n;j++){
                if(arr[j]>0&&arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            scount += count/2;
        }
        System.out.println(scount);
    }
}

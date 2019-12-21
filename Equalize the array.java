import java.util.Scanner;

public class Equalize {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]  arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int result = equalizearray(arr,n);
        System.out.println(result);
    }
    public static int equalizearray(int[] arr,int n){
        int mcount =0;
        for(int i=0;i<n-1;i++){
            int ecount =0;
            for(int j=0;j<n;j++){
                if (arr[i]==arr[j]){
                    ecount++;
                }
            }
            if(ecount>mcount){
                mcount = ecount;
            }
        }
        return (n-mcount);
    }
}

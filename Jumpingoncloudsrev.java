import java.util.Scanner;

public class Jumpingoncloudsrev {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int e =100;
        for(int i =0;i<n;i= i+k){
            if(arr[i] == 0){
                e--;
            }else{
                e = e - 3;
            }
        }
        System.out.println(e);
    }
}

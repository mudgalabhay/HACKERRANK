import java.util.Scanner;

public class Jumping {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int count=0,i=0;
        while(i<n-1){
            if(i<n-2&&arr[i+2]==0){
                count++;
                i = i+2;
            }else{
                count++;
                i = i+1;
            }
        }
        System.out.println(count);
    }
}

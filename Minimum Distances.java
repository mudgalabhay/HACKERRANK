import java.util.Scanner;

public class Minimum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]  arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int result = mindis(arr,n);
        System.out.println(result);
    }
    static int mindis(int[] arr,int n){
        int count =0;
        int min=n-1;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i] == arr[j]) {
                    int emin = j-i;

                    if (emin < min) {
                        min = emin;
                    }
                    count++;
                }

                }
            }
        if(count ==0){
            min = -1;
        }
        return min;
        }
    }

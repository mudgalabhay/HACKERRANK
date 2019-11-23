import java.util.Scanner;

public class Flatlandspacestations {
    static int flatland(int n,int m,int[] arr){
        int mindis=n-1,maxdis;
        int dis;
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
           for(int j=0;j<arr.length;j++){
               dis = Math.abs(i-arr[j]);
               if(dis<mindis){
                   mindis = dis;
               }
           }
            arr1[i] = mindis;
            mindis = n-1;
        }
        maxdis = arr1[0];
        for (int i=0;i<n;i++){
            if(arr1[i]>maxdis){
                maxdis = arr1[i];
            }
        }
        return maxdis ;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[] = new int[m];
        for(int i =0;i<m;i++){
            arr[i] =in.nextInt();
        }
        int result = flatland(n,m,arr);
        System.out.println(result);
    }
}

import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
     
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int[] sortedArr = sort(arr);
        print(sortedArr);
    }
    
    
    static void print(int[] arr){
        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static int[] sort(int[] arr){
        int[] count = new int[100];
        int[] newArr = new int[arr.length + 1];
        
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        
        for(int i = 0; i < count.length - 1; i++){
            count[i + 1] = count[i] + count[i + 1];
        }
        
        for(int i = 0; i < arr.length; i++){
            int index = arr[i];
            int indexCount = count[index]--;
            newArr[indexCount] = index;
        }
        
        return newArr;
   }
}

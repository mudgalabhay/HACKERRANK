import java.util.Scanner;

import static java.lang.Math.abs;

public class Beautiful {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = compute(i,j,k);
        System.out.println(result);
    }
    private static int compute(int i,int j,int k){
        int count = 0;
        int rem,gn,x;
        for(int a = i;a<=j;a++){
            x =a;
            int rev =0;
            while(x!=0) {
                rem = x % 10;
                rev = (rev*10) +rem;
                x = x / 10;
            }
            gn = abs(a -rev);
            if(gn%k==0){
                count++;
            }
        }
        return count;
    }

}

import java.util.Scanner;

public class HalloweenSale {
    private static int compute(int p,int d,int m,int s){
          int count = 0;
        while(s>=p){
            count++;
            s -=p;
            p = Math.max(p-d,m);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int result = compute(p,d,m,s);
        System.out.println(result);
    }
}

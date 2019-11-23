import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        long n = in.nextLong();
        int p = in.nextInt();
        if(p==1||p==n){
            System.out.println(0);
        }
        if(p<=(n/2)&&p>1){
            System.out.println(p/2);
        }
        if(p>(n/2)&&p<n){
            System.out.println((n/2)-(p/2));
        }
    }
}

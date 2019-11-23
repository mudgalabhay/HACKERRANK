import java.util.Scanner;

public class ChoclateFeast {
    private static int compute(int n,int c,int m){
        int nc = n/c;
        int nw = n/c;
        while(nw >= m){
            int r = nw/m;
            nw = r+(nw%m);
            nc = nc +r;
        }
       return nc;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0;i<t;i++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = compute(n,c,m);
            System.out.println(result);
        }
    }
}

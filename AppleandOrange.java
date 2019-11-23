import java.util.Scanner;

public class AppleandOrange {
    private static int compute(int s,int t,int a,int m,int[] apple){
        int acount=0;
        for(int i=0;i<m;i++){
            apple[i] = apple[i]+ a;
            if(apple[i]>=s&&apple[i]<=t){
                acount++;
            }
        }
        return acount;

    }
    private static int compute2(int s,int t,int b,int n,int[] oranges){
        int ocount =0;
        for(int i=0;i<n;i++){
            oranges[i] = oranges[i]+ b;
            if(oranges[i]>=s&&oranges[i]<=t){
                ocount++;
            }
        }
        return ocount;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int[] oranges = new int[n];
        for (int i=0;i<m;i++){
            apple[i] = in.nextInt();
        }
        for (int i=0;i<n;i++){
            oranges[i] = in.nextInt();
        }
        int result1 = compute(s,t,a,m,apple);
        int result2 = compute2(s,t,b,n,oranges);
        System.out.println(result1);
        System.out.println(result2);
    }
}

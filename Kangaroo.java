import java.util.Scanner;

public class Kangaroo {
    private static String compute(int x1,int v1,int x2,int v2){
        if(v2>v1&&x2>x1){
            return "NO";
        }else{
            for(int i=0;i<10000;i++){
                x1 = x1 + v1;
                x2 = x2 + v2;
                if (x1 == x2) {
                    return "YES";
                }
            }
            return "NO";
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2  = in.nextInt();

        String res = compute(x1,v1,x2,v2);
        System.out.println(res);
    }
}

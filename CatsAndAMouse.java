import java.util.Scanner;

public class CatsAndAMouse {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int q = in.nextInt();
        for (int i=0;i<q;i++){
            int x =  in.nextInt();
            int y = in.nextInt();
            int z= in.nextInt();
            String result = compute(x,y,z);
            System.out.println(result);
        }
    }
    static String compute(int x,int y,int z){
        int t = Math.abs(x-z);
        int c = Math.abs(y-z);
        if (t>c){
            return "Cat B";
        }else if(c>t){
            return "Cat A";
        }else{
            return "Mouse C";
        }
    }
}

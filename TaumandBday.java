import java.util.Scanner;

public class TaumandBday {
    private static long compute(long b,long w,long bc,long wc,long z){
         long tc =0;
         if(bc>(wc+z)&&bc>wc){
             bc = wc+z;

            tc = (b*bc)+(w*wc);
         }else if(wc>(bc+z)&&wc>bc){
           wc = bc +z;
           tc = (b*bc)+(w*wc);
         }else{
             tc = (b*bc)+(w*wc);
         }
         return tc;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            long b = in.nextLong();
            long w = in.nextLong();
            long bc = in.nextLong();
            long wc = in.nextInt();
            long z = in.nextInt();
            long result = compute(b,w,bc,wc,z);
            System.out.println(result);
        }
    }
}

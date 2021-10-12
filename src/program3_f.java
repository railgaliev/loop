import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program3_f {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a =0;
        int b =0;
        for (int i=0; x!=0; i++) {
            a = x % 10;
            x = x / 10;
            b = b * 10;
            b = b + a;

        }
        System.out.print(b);
        /*boolean b = false;
        int a=1;
        if (x==0) {
            System.out.print(0);
        }

        for (int i=0; x!=0; i++) {
            a=x%10;
            x=(x-a)/10;
            if (a!=0){
                b=false;
            }
            if (a==0 && i==0 && b==true){
                continue;
            }
            //x=(x-a)/10;
            System.out.print(a);

        }*/

        in.close();
    }
}
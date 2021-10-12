import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program3_d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int d = in.nextInt();
        int i=0;
        int a=1;

        for (; x!=0;) {
            a=x%10;
            if (a==d) {
                i++;
            }
            x=(x-a)/10;

        }
        System.out.print(i);
        in.close();
    }
}

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program4_theme3_h {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int f0 = 0;
        int f1 = 1;
        int fi = 0;
        int i = 2;
        if (N == 0) {
            System.out.print(0);
        }
        if (N == 1) {
            System.out.print(1);
        }
        if (N != 0 && N != 1) {
            while (i <= N) {
                fi = f0 + f1;
                f0 = f1;
                f1 = fi;
                i++;
            }
            System.out.print(fi + " ");
            in.close();
        }
    }
}
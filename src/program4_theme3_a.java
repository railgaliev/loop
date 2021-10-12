
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program4_theme3_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 1;
        int i = 1;

        if (N == 0 || N == 1) {
            System.out.print(0);
        }
        while (a<=N) {
            System.out.print(a + "\n");
            i++;
            a=i*i;

            }
            in.close();
        }
    }

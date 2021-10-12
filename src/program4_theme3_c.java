
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program4_theme3_c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 1;
        int j = 1;

        while (i<=N)
        {
            System.out.print(i + " ");
            i = i * 2;
        }
        in.close();
    }
}

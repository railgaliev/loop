
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program3_c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = 1; i <= b; i++) {
            if (a <= i * i && b >= i * i) {
                System.out.print(i * i + " ");
            }
            in.close();
        }
    }
}
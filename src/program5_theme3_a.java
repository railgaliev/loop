import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program5_theme3_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        int i = 0;
            do {
                N = in.nextInt();
                i++;
            }while (N != 0);
            System.out.print(i-1);
            in.close();
        }
    }

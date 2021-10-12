
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program4_theme3_b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 2;


        while (N%i!=0) {
            i++;
        }
        System.out.print(i + "\n");
        in.close();
    }
}

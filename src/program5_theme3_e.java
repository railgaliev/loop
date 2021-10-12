import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program5_theme3_e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        int max=0;
        int i = 0;
        do {
            N = in.nextInt();
            if (max<N){
                max=N;
            }
        }while (N != 0);
        System.out.print(max);
        in.close();
    }
}

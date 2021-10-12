import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program5_theme3_g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        int max1 = 0;
        int max2 = 0;
        do {
            N = in.nextInt();
            if (max1 < N) {
                max2 = max1;
                max1 = N;
            }
            else if (max2<N){
                max2=N;
            }
        }while (N != 0);
        System.out.print(max2);
        in.close();

    }
}
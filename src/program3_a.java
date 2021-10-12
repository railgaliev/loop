
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program3_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i=a; i<=b; i++){
            if (i%2==0) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}



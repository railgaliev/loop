import java.util.Scanner;
import static java.lang.Math.sqrt;

public class program3_e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int sum=0;
        int a=1;

        for (; x!=0;) {
            a=x%10;
            sum=sum+a;
            x=(x-a)/10;

        }
        System.out.print(sum);
        in.close();
    }
}
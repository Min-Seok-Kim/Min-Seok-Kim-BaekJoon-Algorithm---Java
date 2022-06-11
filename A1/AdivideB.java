package A1;
import java.util.Scanner;
public class AdivideB {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        double A = ms.nextInt();
        double B = ms.nextInt();

        ms.close();

        System.out.println(A / B);
    }
}

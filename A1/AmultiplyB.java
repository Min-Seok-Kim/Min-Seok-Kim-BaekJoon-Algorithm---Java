package A1;
import java.util.Scanner;

public class AmultiplyB {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int A, B;

        A = ms.nextInt();
        B = ms.nextInt();
        ms.close();

        System.out.println(A * B);
    }
}

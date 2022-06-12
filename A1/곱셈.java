package A1;
import java.util.Scanner;
public class °ö¼À {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int A = ms.nextInt();
        int B = ms.nextInt();

        ms.close();

        System.out.println(A * (B % 10));
        System.out.println(A * ((B % 100)/10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);

    }
}

package A1;
import java.util.Scanner;
public class ³ª¸ÓÁö {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int A = ms.nextInt();
        int B = ms.nextInt();
        int C = ms.nextInt();
        ms.close();
        
        System.out.println((A+B)%C);
        System.out.println((A%C) + (B%C));
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C))%C);
    }
}

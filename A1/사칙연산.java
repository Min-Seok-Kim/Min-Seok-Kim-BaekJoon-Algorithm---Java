package A1;
import java.util.Scanner;
public class ��Ģ���� {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int A = ms.nextInt();
        int B = ms.nextInt();

        ms.close();

        System.out.println(A + B);
        System.out.println(A - B);    
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}
package ���ǹ�;
import java.util.Scanner;

public class �μ����ϱ� {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int A = ms.nextInt();
        int B = ms.nextInt();
        ms.close();

        if(A > B){
            System.out.println(">");
        }
        else if(A < B){
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }
}
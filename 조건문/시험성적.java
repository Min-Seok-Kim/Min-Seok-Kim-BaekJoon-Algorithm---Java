package 조건문;
import java.util.Scanner;

public class 시험성적 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int scores = ms.nextInt();
        ms.close();

        switch(scores/10){
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

    }
}

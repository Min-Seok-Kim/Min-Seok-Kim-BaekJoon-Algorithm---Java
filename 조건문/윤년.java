package Á¶°Ç¹®;
import java.util.*;

public class À±³â {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int year = ms.nextInt();
        ms.close();

        if(year%4 == 0){
            if(year % 400 == 0){
                System.out.println("1");
            }else if(year % 100 == 0) {
                System.out.println("0");
            }else System.out.println("1");
        }else System.out.println("0");
    }
}

package ���ǹ�;
import java.util.*;

public class ��и���� {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int x = ms.nextInt();
        int y = ms.nextInt();
        ms.close();

        if(x > 0){
            if(y > 0){
                System.out.println("1");
            } else{
                System.out.println("4");
        }
        }
        if(x < 0){
            if (y > 0){
                System.out.println("2");
            } else {
                System.out.println("3");
        }
        }
    }
}
package 조건문;
import java.util.*;
public class 주사위세개 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int a = ms.nextInt();
        int b = ms.nextInt();
        int c = ms.nextInt();
        ms.close();
        int price = 0;

       if(a == b && b == c && a == c){
        price = 10000 + a * 1000;
       }
       else if(a == b || a == c){
        price = 1000 + a * 100;
       }
       else if(b == c){
        price = 1000 + b * 100;
       }
       else{
        price = (Math.max(a, Math.max(b, c)));
       }

       System.out.println("총 상금: " + price);
    }
    
}

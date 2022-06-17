package 반복문;
import java.util.*;

public class 구구단 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int a = ms.nextInt();
        ms.close();
       
        
        for(int i = 1; i <= 9; i++){
            int result = 0;
            result = a * i;
            System.out.println(a + "*" + i + "=" + result);
        }
    }
   

}

package �ݺ���;
import java.util.*;

public class ������ {
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

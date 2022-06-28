import java.util.*;

public class AplusBminus7 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        
        int T = ms.nextInt();
        int sum = 0;
        

        for(int i = 1; i <= T; i++){
            int A = ms.nextInt();
            int B = ms.nextInt();
            sum = A + B;
            System.out.println("Case #" + i + ":" + sum);
        }

        ms.close();
    }
}

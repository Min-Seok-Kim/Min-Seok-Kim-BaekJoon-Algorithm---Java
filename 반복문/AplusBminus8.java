import java.util.*;

public class AplusBminus8 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        
        int T = ms.nextInt();

        for(int i = 1; i <= T; i++){
            int A = ms.nextInt();
            int B = ms.nextInt();

            System.out.println("Case #" + i + ":" + A + "+" + B + "=" + (A + B));
        }
        ms.close();
    }
}

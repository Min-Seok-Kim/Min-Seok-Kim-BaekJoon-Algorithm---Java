import java.util.*;

public class 알람시계 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int H = ms.nextInt();
        int M = ms.nextInt();
        ms.close();

        if(M < 45){
            if(H > 0){
                H -= 1;
                M += 15;
            } else {
                H += 23;
                M += 15;
            }       
        }
        System.out.println(H + " " + M);
    }
}

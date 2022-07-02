package 조건문;
import java.util.*;
public class 오븐시계 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int H = ms.nextInt();
        int M = ms.nextInt();
        int C = ms.nextInt();
        ms.close();

        int a = H*60 + M + C;
        H = a/60;
        M = a%60;

        if (H>=24) {
			H= H-24;
		}
		
		System.out.println(H + " "+ M);
    }
}

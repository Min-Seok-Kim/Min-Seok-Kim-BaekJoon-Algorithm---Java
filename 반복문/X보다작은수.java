import java.util.*;

public class X보다작은수 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int N = ms.nextInt();
        int X = ms.nextInt();
		for (int i = 0; i < N; i++) {
			int A = ms.nextInt();
			if(A < X) System.out.print(A+" ");
		}
    }
}

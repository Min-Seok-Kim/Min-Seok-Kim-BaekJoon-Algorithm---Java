import java.util.*;

public class º°Âï±âminus2 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int T = ms.nextInt();
        ms.close();

        for(int i = 1; i <= T; i++){
            for(int j = 1; j <= T - i; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

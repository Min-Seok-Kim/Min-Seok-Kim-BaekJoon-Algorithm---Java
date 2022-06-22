import java.util.*;

public class plus {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int num = ms.nextInt();

        ms.close();

        int sum = 0;

        for(int i = 1; i <= num; i++){
                sum += i;
        }
        System.out.println(sum);
    }
}

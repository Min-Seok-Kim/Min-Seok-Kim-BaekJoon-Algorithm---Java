import java.util.*;

public class AplusBminus5 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        while(true){
            int A = ms.nextInt();
            int B = ms.nextInt();

            if(A + B == 0){
                ms.close();
                break;
            }
            System.out.println(A + B);
        }
    }
}

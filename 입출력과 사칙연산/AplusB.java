package A1;
import java.util.Scanner;
public class AplusB{
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);


        int A = q.nextInt();
        int B = q.nextInt();
        q.close();
        
        System.out.println(A + B);
    }
}

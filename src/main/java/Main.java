/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number...");

        Integer n = num.nextInt();
        Integer sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

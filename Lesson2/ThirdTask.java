//https://acmp.ru/index.asp?main=task&id_task=766
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if (N * M < K){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
//https://acmp.ru/index.asp?main=task&id_task=539
import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println(0);
        }
        else if (x % 2 == 1){
            System.out.println(x);
        }
        else{
            System.out.println(x / 2);
        }
    }
}
//https://acmp.ru/index.asp?main=task&id_task=61
import java.util.Scanner;

public class ForthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterFirstTeam = 0;
        int counterSecondTeam = 0;

        for (int i = 0; i < 8; i += 2) {
            int x = scanner.nextInt();
            counterFirstTeam += x;
            int y = scanner.nextInt();
            counterSecondTeam += y;
        }
        if (counterFirstTeam < counterSecondTeam){
            System.out.println(2);
        }
        else if (counterFirstTeam == counterSecondTeam){
            System.out.println("DRAW");
        }
        else{
            System.out.println(1);
        }
    }
}
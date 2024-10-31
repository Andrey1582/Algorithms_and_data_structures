
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 100;
        OrrderArray orderedArray = new OrrderArray(size);

        for (int i = 0; i < size; i++) {
            boolean insertOrderedArray = false;

            while (!insertOrderedArray) {
                insertOrderedArray = orderedArray.insert(random.nextLong(500));
            }
        }

        long searchValue = random.nextLong(500);


        if (orderedArray.contains(searchValue)) {
            System.out.println("Значение " + searchValue + " было найдено. " );
        } else {
            System.out.println("Не удалось найти значение. " + searchValue);
        }


        System.out.println("Максимальное значение массива " + orderedArray.getMaxElem());
        System.out.println("Минимальное значение массива " + orderedArray.getMinElem());

    }
}
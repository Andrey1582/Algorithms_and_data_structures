public class Array implements Interface {
    private final long[] array;
    private int n;

    public Array(int size) {
        this.array = new long[size];
        this.n = 0;
    }
    public boolean delete(long value) {
        int i;
        for (i = 0; i < this.n; i++) {
            if (array[i] == value) {
                break;
            }
        }

        if (i == n - 1) {
            return false;
        } else {
            for (int j = i; j < n - 1; j++) {
                array[j] = array[j + 1];
            }
            n--;
            return true;
        }
    }

    public boolean find(long searchValue) {
        for (int i = 0; i < this.n; i++) {
            if (array[i] == searchValue) {
                return true;
            }
        }

        return false;
    }

    public void insert(long value) {
        array[n] = value;
        n++;
    }



    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public void getSize() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count ++;
            }
        System.out.println(count);
    }
    
    public void getMaxElem() {
        int maxElem = 0;
        for (int i = 0; i < n; i++){
            if (array[i] > maxElem) {
                maxElem = (int) array[i];
            }
        }
        System.out.println(maxElem);
    }

    public void getMinElem() {
        long minElem = array[0];
        for (int i = 0; i < n; i++){
            if(array[i] < minElem){
                minElem = (int) array[i];
            }
        }
        System.out.println(minElem);
    }
}

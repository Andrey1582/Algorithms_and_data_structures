public abstract class Array implements Interface {
    protected final long[] array;
    protected int n;

    public Array(int size) {
        this.array = new long[size];
        this.n = 0;
    }

    public boolean insert(long value) {
        for (int i = 0; i < n; i++) {
            if (array[i] == value) {
                return false;
            }
        }

        array[n] = value;
        n++;
        return true;
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

    public int getMaxElem() {
        int maxElem = 0;
        for (int i = 0; i < n; i++){
            if (array[i] > maxElem) {
                maxElem = (int) array[i];
            }
        }
        return maxElem;
    }


    public long getMinElem() {
        long minElem = array[0];
        for (int i = 0; i < n; i++){
            if(array[i] < minElem){
                minElem = (int) array[i];
            }
        }
        return minElem;
    }

}
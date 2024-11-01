public class OrrderArray extends Array{

    public OrrderArray(int size) {
        super(size);
    }

    public boolean contains(long searchValue) {
        int lower = 0;
        int upper = n - 1;
        int curInd;

        while (true) {
            curInd = (lower + upper) / 2;
            long curElem = array[curInd];
            if (curElem == searchValue) {
                return true;
            } else if (lower > upper) {
                return false;
            } else {
                if (curElem < searchValue) {
                    lower = curInd + 1;
                } else {
                    upper = curInd - 1;
                }
            }
        }
    }

    public boolean delete(long searchValue) {
        int lower = 0;
        int upper = n - 1;
        int curElem = -1;

        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (array[mid] == searchValue) {
                curElem = mid;
                break;
            } else if (array[mid] < searchValue) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }

        if (curElem == -1) {
            return false;
        }

        for (int i = curElem; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        n--;
        return true;
    }
    
    public boolean insert(long value) {
        if (this.contains(value)) {
            return false;
        }

        int i;
        for (i = 0; i < n; i++) {
            if (array[i] > value) {
                break;
            }
        }

        for (int j = n; j > i; j--) {
            array[j] = array[j - 1];
        }

        array[i] = value;
        n++;
        return true;
    }
    
    public int getMaxElem()
    {
        return (int) array[array.length - 1];
    }

    public long getMinElem()
    {
        return (int) array[0];
    }
}


import java.util.Arrays;

public class MyMath {
    private int[] arr;

    @Override
    public String toString() {
        return "MyMath{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    MyMath(int n){
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (100*Math.random());
        }
    }

    void sortBuble(){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    change(j,j+1);
                }
            }
        }
    }

    private void change(int j, int i) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    public int binarySearch(int num) {
        if (num == arr[0]) {
            return 0;
        } else if (num == arr[arr.length-1]) {
            return arr.length-1;
        } else if (num > arr[arr.length-1] || num < arr[0]) {
            return -1;
        }

        int i,j;

        do {
            i = (arr.length-1)/2;

        } while ( num != arr[i] && i!= j);

        if (i > 0 && i < arr.length) {

        } else {
            return -1;
        }


        return -1;

    }

}

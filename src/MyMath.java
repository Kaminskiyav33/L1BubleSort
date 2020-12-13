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

        int left = 0;
        int right = arr.length-1;
        int middle = (right)/2;


        do {
            if (arr[middle] == num) {
                return middle;
            }

            if (arr[middle] > num) {
                right = middle;
                middle = (right - left) /2;
            }
            else if (arr[middle] > num) {
                left = middle;
                middle = (right - left) /2;
            }
        } while (left != middle && middle != right);

        return -1;

    }

}

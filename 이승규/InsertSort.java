public class InsertSort {
    private int[] arr;
    private int n; // arr.length

    public InsertSort() {

    }

    public InsertSort(int[] arr) {
        this.arr = arr;
        this.n = arr.length;
    }

    //asdc
    public void sort(int[] arr) {
        for (int i = 0; i < this.n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int select = arr[i + 1];
                int j = i;
                while (true) {
                    if (arr[j] >= select) {
                        arr[j + 1] = arr[j];
                        j--;
                    } else {
                        arr[j + 1] = select;
                        break;
                    }
                    if (j < 0) {
                        arr[0] = select;
                        break;
                    }
                }
            }
        }
    }

    // desc
    public void sort_reverse(int[] arr) {
        for (int i = 0; i < this.n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int select = arr[i + 1];
                int j = i;
                while (true) {
                    if (arr[j] <= select) {
                        arr[j + 1] = arr[j];
                        j--;
                    } else {
                        arr[j + 1] = select;
                        break;
                    }

                    if (j < 0) {
                        arr[0] = select;
                        break;
                    }
                }
            }
        }
    }

    public void print(int[] arr) {
        for (int i : arr) {
            System.out.printf(i+" ");
        }
        System.out.println();
    }
}
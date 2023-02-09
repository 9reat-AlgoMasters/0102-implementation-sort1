public class SelectionSort {
    private int[] arr;
    private int n; // 배열 길이

    public SelectionSort() {

    }

    public SelectionSort(int[] arr) {
        this.arr = arr;
        this.n = arr.length;
    }

    public void sort(int[] arr) {

        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            if (i != min_index) {
                int tmp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = tmp;
            }

        }

    }
    public void sort_reverse(int[] arr) {

        for (int i = 0; i < n-1; i++) {
            int max_index = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }
            if (i != max_index) {
                int tmp = arr[i];
                arr[i] = arr[max_index];
                arr[max_index] = tmp;
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

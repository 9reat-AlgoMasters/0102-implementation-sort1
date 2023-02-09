public class BubbleSort {

    private int[] arr;
    private int n; // 배열 길이

    // 생성자 1
    public BubbleSort() {
    }

    //생성자 2
    public BubbleSort(int[] array) {
        this.arr = array;
        this.n = array.length;
    }

    // asc
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < this.n-1; i++) {
            for (int j = i + 1; j < this.n; j++) {
                if (arr[i] > arr[j]) {
//                    swap(arr[i], arr[j]); // java는 call-by-value이기 때문에 swap함수를 써서는 안됐다.
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    // desc
    public void sort_reverse(int[] arr) {

        for (int i = 0; i < this.n-1; i++) {
            for (int j = i + 1; j < this.n; j++) {
                if (arr[i] < arr[j]) {
//                    swap(arr[i], arr[j]); // java는 call-by-value이기 때문에 swap함수를 써서는 안됐다.
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    // 배열 출력
    public void print(int[] arr) {
        for (int i : arr) {
            System.out.printf(i+" ");
        }
        System.out.println();
    }

//    public void swap(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
//    }

}

public class CountingSort {
    private int[] arr;
    private int n; // 배열 길이

    public CountingSort() {

    }

    public CountingSort(int[] arr) {
        this.arr = arr;
        this.n = arr.length;
    }

    public void sort(int[] arr) {
        int[] result = new int[n+1];
        int max = 0; // 카운팅 정렬의 데이터는 0 이상.
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // 원시 배열의 값을 인덱스로 하는 nums배열 선언
        int[] nums = new int[max+1];

        // arr의 value값을 nums배열의 인덱스를 값으로 하는 수의 개수 카운트
        for (int i = 0; i < this.n; i++) {
            nums[arr[i]]++;
        }
        // nums배열을 nums배열의 누적합으로 변경
        for (int i = 1; i < nums.length; i++) {
           nums[i] += nums[i-1];
        }
        // arr 배열을 끝에서 부터 하나씩 꺼내어 그 값을 nums배열의 인덱스로 사용하여 접근
        for (int i = 1; i <= n; i++) {
            result[nums[arr[n-i]]] = arr[n-i];
            nums[arr[n-i]]--;
        }

        this.arr = result;

    }

    public void sort_reverse(int[] arr) {
        int[] result = new int[n+1];
        int max = 0; // 카운팅 정렬의 데이터는 0 이상.
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // 원시 배열의 값을 인덱스로 하는 nums배열 선언
        int[] nums = new int[max+1];

        // arr의 value값을 nums배열의 인덱스를 값으로 하는 수의 개수 카운트
        for (int i = 0; i < this.n; i++) {
            nums[arr[i]]++;
        }
        // nums배열을 nums배열의 누적합으로 변경
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        // arr 배열을 끝에서 부터 하나씩 꺼내어 그 값을 nums배열의 인덱스로 사용하여 접근
        for (int i = 1; i <= n; i++) {
            result[n-nums[arr[n-i]]] = arr[n-i];
            nums[arr[n-i]]--;
        }

        this.arr = result;

    }


    public void print() {
        for (int i : this.arr) {
            if (i != 0) {
                System.out.printf(i + " ");
            }
        }
        System.out.println();
    }



}

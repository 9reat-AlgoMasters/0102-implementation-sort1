public class CountingSort {
    protected int[] array;
    protected int[] countArray;
    protected int[] sortedArray;
    protected int max;
    public CountingSort(int[] arr) {
        this.max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            this.max = Math.max(max, arr[i]);
        }
        this.array = arr;

        this.countArray = new int[max+2];
        this.sortedArray = new int[max+1];
    }

    //개수 카운팅
    private void buildCountArray() {
        for (int i = 1; i < array.length; i++) {
            countArray[array[i]]++;
        }
    }

    private void sortByCount() {
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            int t = countArray[num];
            sortedArray[t] = num;
            countArray[num]--;
        }
    }

    private void buildStringAndPrintSortedResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sortedArray.length; i++) {
            if(sortedArray[i] != 0){
                sb.append(sortedArray[i] + " ");
            }
        }
        System.out.println(sb.toString());
    }

    public void naturalSort() {
        buildCountArray();

        // 누접합 배열 생성
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] = countArray[i-1] + countArray[i];
        }

        sortByCount();

        buildStringAndPrintSortedResult();
    }

    public void reverseSort() {
        // 개수 카운팅
        for (int i = 1; i < array.length; i++) {
            countArray[array[i]]++;
        }

        // 누접합 배열 생성
        for (int i = countArray.length - 2; i > 0; i--) {
            countArray[i] = countArray[i+1] + countArray[i];
        }

        sortByCount();

        buildStringAndPrintSortedResult();
    }
}

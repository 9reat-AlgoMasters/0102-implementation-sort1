public class InsertionSort {
    protected int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public void naturalSort() {
        for (int k = 1; k < array.length; k++) {
            StringBuilder sb = new StringBuilder();
            sb.append((k + 1) + " 회전\n");

            int num = array[k];
            int i = k - 1;
            // switching
            while (i >= 0 && num < array[i]){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = num;
            // 결과 출력부
            for (int j = 0; j < array.length; j++) {
                sb.append(array[j] + " ");
            }
            System.out.println(sb.toString());
        }
    }

    public void reverseSort() {
        for (int k = 1; k < array.length; k++) {
            StringBuilder sb = new StringBuilder();
            sb.append((k + 1) + " 회전\n");

            int num = array[k];
            int i = k - 1;
            // switching
            while (i >= 0 && num > array[i]){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = num;
            // 결과 출력부
            for (int j = 0; j < array.length; j++) {
                sb.append(array[j] + " ");
            }
            System.out.println(sb.toString());
        }
    }
}

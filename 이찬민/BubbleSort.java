public class BubbleSort {
    protected int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void naturalSort() {
        for (int k = 0; k < array.length-1; k++) {
            StringBuilder sb = new StringBuilder();
            sb.append((k + 1) + " 회전\n");

            for (int i = 0; i < array.length - 1; i++) {
                // switching
                if (array[i+1] < array[i]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }

            // 결과 출력부
            for (int j = 0; j < array.length; j++) {
                sb.append(array[j] + " ");
            }
            System.out.println(sb.toString());
        }
    }

    public void reverseSort() {
        for (int k = 0; k < array.length-1; k++) {
            StringBuilder sb = new StringBuilder();
            sb.append((k + 1) + " 회전\n");

            for (int i = 0; i < array.length - 1; i++) {
                // switching
                if (array[i+1] > array[i]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }

            // 결과 출력부
            for (int j = 0; j < array.length; j++) {
                sb.append(array[j] + " ");
            }
            System.out.println(sb.toString());
        }
    }
}

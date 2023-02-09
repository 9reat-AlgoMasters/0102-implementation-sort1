public class SelectionSort {
    protected int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public void naturalSort() {
        for (int i = 0; i < array.length-1; i++) {

            // find min value
            int minValue = Integer.MAX_VALUE;

            int pos = i;
            for (int k = i; k < array.length; k++) {
                if (minValue > array[k]){
                    minValue = Math.min(array[k], minValue);
                    pos = k;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append((i + 1) + " 회전\n");

            int temp = array[pos];
            array[pos] = array[i];
            array[i] = temp;


            for (int j = 0; j < array.length; j++) {
                sb.append(array[j] + " ");
            }
            System.out.println(sb.toString());
        }
    }

    public void reverseSort() {
        for (int i = 0; i < array.length-1; i++) {

            // find min value
            int maxValue = Integer.MIN_VALUE;

            int pos = i;
            for (int k = i; k < array.length; k++) {
                if (maxValue < array[k]){
                    maxValue = Math.max(array[k], maxValue);
                    pos = k;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append((i + 1) + " 회전\n");

            int temp = array[pos];
            array[pos] = array[i];
            array[i] = temp;


            for (int j = 0; j < array.length; j++) {
                sb.append(array[j] + " ");
            }
            System.out.println(sb.toString());
        }
    }
}

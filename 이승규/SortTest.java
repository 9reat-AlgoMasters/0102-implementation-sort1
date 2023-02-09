public class SortTest {
    public static void main(String[] args) {
        int[] arr = {1, 11, 13, 4, 17, 2,  7, 3, 6, 5, 10};


        BubbleSort bs = new BubbleSort(arr);
        InsertSort is = new InsertSort(arr);
        SelectionSort ss = new SelectionSort(arr);
        CountingSort cs = new CountingSort(arr);

        System.out.println("----------버블 정렬----------");
        bs.sort(arr);
        bs.print(arr);
        bs.sort_reverse(arr);
        bs.print(arr);

        System.out.println("----------삽입 정렬----------");
        is.sort(arr);
        is.print(arr);
        is.sort_reverse(arr);
        is.print(arr);

        System.out.println("----------선택 정렬----------");
        ss.sort(arr);
        ss.print(arr);
        ss.sort_reverse(arr);
        ss.print(arr);

        System.out.println("----------계수 정렬----------");
        cs.sort(arr);
        cs.print();
        cs.sort_reverse(arr);
        cs.print();



    }
}

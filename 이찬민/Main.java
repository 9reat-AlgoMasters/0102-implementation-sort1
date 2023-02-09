import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("원하는 정렬을 선택하세요>>" );
        StringBuilder sb = new StringBuilder();
        sb.append("1. 선택정렬\n");
        sb.append("2. 버블정렬\n");
        sb.append("3. 삽입정렬\n");
        sb.append("4. 계수정렬\n");
        sb.append("5. 종료\n");

        System.out.println(sb.toString());

        int select = Integer.parseInt(br.readLine());
        while (!(select < 6 && select > 0)) {
            System.out.println("정확한 숫자를 입력해주세요!!");
            System.out.println(sb.toString());
            select = Integer.parseInt(br.readLine());
        }

        if (select == 5) {
            System.exit(0);
        }

        sb.setLength(0);

        System.out.println("숫자들을 입력해주세요 (띄워쓰기 사용)>> ");

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();


        switch (select) {
            case 1:
                SelectionSort selectionSort = new SelectionSort(nums);
                System.out.println("선택정렬 오름차순");
                selectionSort.naturalSort();
                SelectionSort selectionSort2 = new SelectionSort(nums);
                System.out.println("선택정렬 내림차순");
                selectionSort2.reverseSort();
                break;
            case 2:
                BubbleSort bubbleSort = new BubbleSort(nums);
                System.out.println("버블정렬 오름차순");
                bubbleSort.naturalSort();
                System.out.println("----------------------------------------------------------------------------");
                BubbleSort bubbleSort2 = new BubbleSort(nums);
                System.out.println("버블정렬 내림차순");
                bubbleSort2.reverseSort();
                break;
            case 3:
                InsertionSort insertionSort = new InsertionSort(nums);
                System.out.println("삽입정렬 오름차순");
                insertionSort.naturalSort();
                System.out.println("----------------------------------------------------------------------------");
                InsertionSort insertionSort2 = new InsertionSort(nums);
                System.out.println("삽입정렬 내림차순");
                insertionSort2.reverseSort();
                break;
            case 4:
                CountingSort countingSort = new CountingSort(nums);
                System.out.println("계수정렬 오름차순");
                countingSort.naturalSort();
                System.out.println("----------------------------------------------------------------------------");
                CountingSort countingSort2 = new CountingSort(nums);
                System.out.println("계수정렬 내림차순");
                countingSort2.reverseSort();
                break;

        }
    }
}

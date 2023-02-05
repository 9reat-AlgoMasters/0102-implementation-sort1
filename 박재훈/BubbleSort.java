
import java.util.Scanner;

public class BubbleSort {
    static int[] arr;
    static int size;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정렬할 숫자의 개수를 입력하세요>>");
        size = sc.nextInt();

        arr = new int[size];
        System.out.println("정렬할 숫자들을 입력하세요>>");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("1: 오름차순 2: 내림차순 정렬 방식을 고르세요>>");
        int mode = sc.nextInt();

        bubble_sort(mode);

    }
    private static void bubble_sort(int mode) {
        if(mode == 1) {
            // 오름 차순
            // 맨 앞부터 옆 숫자와 비교하여 큰수를 뒤로보냄
            // 자연스럽게 정렬 안된 수 중 가장 큰수가 배열의 뒷부분으로 가서 정렬되는 방식
            for (int i = 0; i < size-1; i++) {
                for (int j = 0; j < size-1-i; j++) { // i번 반복문 돌면 뒤에서 i번째까지는 정렬완료, 반복에서 제외가능
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr [j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }

                for (int j = 0; j < size; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }else if(mode == 2) {
            for (int i = 0; i < size-1; i++) {
                for (int j = 0; j < size-1-i; j++) {
                    if(arr[j] < arr[j+1]) {
                        int temp = arr[j];
                        arr [j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }

                for (int j = 0; j < size; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}

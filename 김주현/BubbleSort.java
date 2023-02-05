import java.io.*;
import java.util.StringTokenizer;

public class BubbleSort {
    static final boolean ASC = true;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.print("숫자 개수 : ");
        int N = Integer.parseInt(br.readLine());
        System.out.print("숫자 입력(띄어쓰기로 구분)\n-> ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print("정렬 방법 (1:오름차순, 2:내림차순) : ");
        boolean order = br.readLine().equals("1");
        
        sort(arr, order);
        System.out.println("** |→ 이후로는 정렬이 되었다는 뜻");
        System.out.println("\n< 정렬결과 >");
        printArr(arr);
    }
    
    public static void sort(int[] arr, boolean order) {
        System.out.println("< 시작 수열 >");
        printArr(arr);
        System.out.println();
        
        if (order == ASC) {
            sortByAscendingOrder(arr);
        } else {
            sortByDescendingOrder(arr);
        }
    }
    
    private static void sortByAscendingOrder(int[] arr) {
        int len = arr.length;
        for (int i=0; i<len-1; i++) {
            for (int j=0; j<len-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
            System.out.printf("%d번 진행 -> ", i+1);
            printArr(arr, len-1-i);
        }
    }
    
    private static void sortByDescendingOrder(int[] arr) {
        int len = arr.length;
        for (int i=0; i<len-1; i++) {
            for (int j=0; j<len-1-i; j++) {
                if (arr[j] < arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
            System.out.printf("%d번 진행 -> ", i+1);
            printArr(arr, len-1-i);
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
    
    private static void printArr(int[] arr, int numOrder) {
        for (int i=0; i<arr.length; i++) {
            System.out.printf("%d ", arr[i]);
            if (i == numOrder -1) {
                System.out.print("|→ ");
            }
        }
        System.out.println();
    }
}

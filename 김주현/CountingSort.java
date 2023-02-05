import java.io.*;
import java.util.StringTokenizer;

public class CountingSort {
    static final boolean ASC = true;
    
    static int[] count;
    static int[] sum;
    static int[] sortedArr;
    static int max;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("☆☆☆ CountingSort Sort ☆☆☆\n");
        System.out.print("숫자 개수 : ");
        int N = Integer.parseInt(br.readLine());
        System.out.print("숫자 입력(띄어쓰기로 구분)\n-> ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        sortedArr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        max = max(arr);
        count = new int[max+1];
        sum = new int[max+1];
        
        System.out.print("정렬 방법 (1:오름차순, 2:내림차순) : ");
        boolean order = br.readLine().equals("1");
        
        // counting
        for (int num : arr) {
            count[num] += 1;
        }
        
        sort(arr, order);
        
        System.out.println("\n< 정렬결과 >");
        printArr(sortedArr);
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
        // 1. sum 배열 구하기
        sum[0] = count[0];
        for (int i=1; i<=max; i++) {
            sum[i] = sum[i-1] + count[i];
        }
        printInitInfo();
        
        // 2. 정렬하기
        int cnt = 1;
        for (int num : arr) {
            if (sum[num] == 0) {
                continue;
            }
            sortedArr[--sum[num]] = num;
            printProcessInfo(cnt++, num, sum[num]);
            System.out.println();
        }
    }
    
    private static void sortByDescendingOrder(int[] arr) {
        // 1. sum 배열 구하기
        sum[max] = count[max];
        for (int i=max-1; i>=0; i--) {
            sum[i] = sum[i+1] + count[i];
        }
        printInitInfo();
        
        // 2. 정렬하기
        int cnt = 1;
        for (int num : arr) {
            if (sum[num] == 0) {
                continue;
            }
            sortedArr[--sum[num]] = num;
            printProcessInfo(cnt++, num, sum[num]);
            System.out.println();
        }
    }
    
    private static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
    
    private static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
        }
        return min;
    }
    
    private static void printInitInfo() {
        int space = 3;
        System.out.println("** count 배열 **");
        printTable(count, space);
        System.out.println("** sum 배열 **");
        printTable(sum, space);
        System.out.println("** 정렬된 배열 **");
        printTable(sortedArr, space);
        System.out.println();
    }
    
    private static void printProcessInfo(int cnt, int number, int sortedNumIndex) {
        int space = 3;
        System.out.printf("%d회차 -> number : %d\n", cnt, number);
        System.out.println("** sum 배열 **");
        printTable(sum, space);
        System.out.println("** 정렬된 배열 **");
        printTable(sortedArr, space, sortedNumIndex);
        System.out.println();
    }
    
    private static void printTable(int[] arr) {
        System.out.printf("%-8s", "index");
        System.out.print("|");
        for (int i=0; i<arr.length; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.printf("%-8s", "number");
        System.out.print("|");
        printArr(arr);
    }
    
    private static void printTable(int[] arr, int space) {
        System.out.printf("%-8s", "index");
        System.out.print("|");
        for (int i=0; i<arr.length; i++) {
            System.out.printf("%"+space+"d", i);
        }
        System.out.println();
        System.out.printf("%-8s", "number");
        System.out.print("|");
        printArr(arr, space);
    }
    
    private static void printTable(int[] arr, int space, int sortedNumIndex) {
        System.out.printf("%-8s", "index");
        System.out.print("|");
        for (int i=0; i<arr.length; i++) {
            System.out.printf("%"+space+"d", i);
        }
        System.out.println();
        System.out.printf("%-8s", "number");
        System.out.print("|");
        printArr(arr, space);
        int lastLineLength = 9+(3*(sortedNumIndex+1));
        System.out.printf("%"+lastLineLength+"s", "↑");
    }
    
    private static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
    
    private static void printArr(int[] arr, int space) {
        for (int num : arr) {
            System.out.printf("%"+space+"d", num);
        }
        System.out.println();
    }
}

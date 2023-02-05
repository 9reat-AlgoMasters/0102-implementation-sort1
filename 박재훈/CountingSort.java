import java.util.Scanner;

public class CountingSort {
	static int[] arr, count, newArr;
	static int size;
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정렬할 숫자의 개수를 입력하세요>>");
		size = sc.nextInt();

		arr = new int[size];
		newArr = new int[size]; //새롭게 정렬된 숫자를 받을 배열
		System.out.println("정렬할 숫자들을 입력하세요>>");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]){ // 정렬할 수들 중 최댓값 찾기
				max = arr[i];
			}
		}
		count = new int[max+1];//각 값들이 몇번 나왔는지 기록하는 배열

		System.out.println("1: 오름차순 2: 내림차순 정렬 방식을 고르세요>>");
		int mode = sc.nextInt();

		counting_sort(mode);
	}

	private static void counting_sort(int mode) {
		if(mode == 1){
			for (int i = 0; i < size; i++) {
				//수가 나온 횟수를 count배열에 저장
				count[arr[i]]++;
			}

			for (int i = 1; i < max + 1; i++) {
				//count배열에 저장된 값들을 누적으로 나타냄
				//i보다 작거나 같은 수의 개수, 즉 정렬시의 인덱스와 같음
				count[i] = count[i] + count[i-1];
			}

			for (int i = 0; i < size; i++) {
				count[arr[i]]--;
				newArr[count[arr[i]]] = arr[i];
				for (int j = 0; j < size; j++) {
					System.out.print(newArr[j]+" ");
				}
				System.out.println();
			}

		}else if(mode == 2){
			for (int i = 0; i < size; i++) {
				count[arr[i]]++;
			}

			for (int i = max-1; i >= 0; i--) {
				//내림차순이므로 i 자신보다 크거나 같은 수의 개수를 저장
				count[i] = count[i] + count[i+1];
			}

			for (int i = 0; i < size; i++) {
				count[arr[i]]--;
				newArr[count[arr[i]]] = arr[i];
				for (int j = 0; j < size; j++) {
					System.out.print(newArr[j]+" ");
				}
				System.out.println();
			}
		}
	}
}
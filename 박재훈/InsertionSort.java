
import java.util.Scanner;

public class InsertionSort {
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

		insertion_sort(mode);

	}
	private static void insertion_sort(int mode) {
		if(mode == 1) {
			//오름차순
			for (int i = 1; i < size; i++) {
				//앞에서 i-1개 원소는 정렬되어 있다 가정, i번째 원소를 정렬된 곳에 자리를 찾아 삽입
				int val = arr[i];
				for (int j = i - 1; j >= 0; j--) {
					//i-1 번째 부터 맨 앞까지 탐색
					if(arr[j] > val){
						// 더 큰 원소를 찾았다면 큰 원소를 뒤로 보내고 탐색을 계속함
						arr[j+1] = arr[j];
						if(j == 0){
							arr[0] = val;
						}
					} else{
						//작은 원소를 찾았다면 그곳이 삽입할 자리, 반복문 탈출
						arr[j+1] = val;
						break;
					}
				}
				for (int j = 0; j < size; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}else if(mode == 2){
			// 내림차순 -> 부호만 반대
			for (int i = 1; i < size; i++) {
				int val = arr[i];
				for (int j = i - 1; j >= 0; j--) {
					if(arr[j] < val){
						arr[j+1] = arr[j];
						if(j == 0){
							arr[0] = val;
						}
					} else{
						arr[j+1] = val;
						break;
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

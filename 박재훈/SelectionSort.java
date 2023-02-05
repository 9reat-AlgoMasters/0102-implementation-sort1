import java.util.Scanner;

public class SelectionSort {
	static int[] arr;
	static int size;
	static int selectedIndex;
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
		
		selection_sort(mode);
		
	}
	
	public static void selection_sort(int mode) {
		if(mode == 1) {
			// 오름차순 -> 가장 작은 수를 앞으로
			for (int i = 0; i < size-1; i++) {
				//인덱스 0부터 작은 수를 순서대로 채울 예정
				selectedIndex = i;
				for (int j = i+1; j < size; j++) {
					//i~끝까지 중 가장 작은 수의 인덱스 저장
					if(arr[j] < arr[selectedIndex]) {
						selectedIndex = j;
					}
				}
				
				//기존 i번째 원소와 가장 작은 수의 자리교체
				int temp = arr[selectedIndex];
				arr[selectedIndex] = arr[i];
				arr[i] = temp;
				
				for (int j = 0; j < size; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}else if(mode == 2){
			// 내림차순 -> 반대로 큰수를 찾자
			for (int i = 0; i < size-1; i++) {
				selectedIndex = i;
				for (int j = i+1; j < size; j++) {
					//i~끝까지 중 가장 큰 수의 인덱스 저장
					if(arr[j] > arr[selectedIndex]) {
						selectedIndex = j;
					}
				}
				
				//기존 i번째 원소와 가장 큰 수의 자리교체
				int temp = arr[selectedIndex];
				arr[selectedIndex] = arr[i];
				arr[i] = temp;
				
				for (int j = 0; j < size; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
	}

}

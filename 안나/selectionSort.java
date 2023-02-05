
public class SelectionSort {
	static int arr[] = {1,9,4,6,8,3,5,2,7,0};
	public static void main(String[] args) {
		// 최솟값을 찾아서 가장 앞으로 

//		asc();
		desc();
		
		
		
	}
	private static void desc() {

		System.out.print("기존 => ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("\n");

		int count=1;
		for (int i = 0; i < arr.length; i++) {
			int index=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[index] < arr[j]) {
					index=j;
				}
			}

			
			switch_num(index, i, count);
			count++;
		}
		
	}
	private static void asc() {

		System.out.print("기존 => ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("\n");

		int count=1;
		for (int i = 0; i < arr.length; i++) {
			int index=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index=j;
				}
			}
			
			switch_num(index, i, count);
			count++;
		}
		
	}
	private static void switch_num(int index, int i, int count) {


		System.out.println(arr[index]+"<->"+arr[i]);
		int temp = arr[i];
		arr[i]=arr[index];
		arr[index]= temp;
		
		System.out.print(count+" => ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("\n");
	}
}

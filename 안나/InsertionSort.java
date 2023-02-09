
public class InsertionSort {
	static int arr[] = {1,4,3,5,2};
	
	public static void main(String[] args) {
		
		System.out.print("기존 => ");
		print();
		
//		asc();
		desc();
		
	}
	private static void desc() {
		for (int i = 1; i < arr.length; i++) {
			System.out.println(i+". ");
			int idx=i;
			for (int j = i-1; j >=0; j--) {
				if(arr[idx]>arr[j]) {
					System.out.println(arr[idx]+"<->"+arr[j]);
					arr[j] = swap(arr[idx], arr[idx]=arr[j]);
					idx=j;
				}else {
					break;
				}
				print();
			}
			
			System.out.println("-----------------");
		}
		
	}
	private static void asc() {
		for (int i = 1; i < arr.length; i++) {
			System.out.println(i+". ");
			int idx=i;
			for (int j = i-1; j >=0; j--) {
				if(arr[idx]<arr[j]) {
					System.out.println(arr[idx]+"<->"+arr[j]);
					arr[j] = swap(arr[idx], arr[idx]=arr[j]);
					idx=j;
				}else {
					break;
				}
				print();
			}
			
			System.out.println("-----------------");
		}
		
	}
	private static void print() {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("\n");
		
	}
	private static int swap(int i, int j) {
		return i;
	}
	
}

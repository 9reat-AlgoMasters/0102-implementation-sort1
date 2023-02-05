
public class CountingSort {
	static int arr[] = {5,5,3,4,5,1,0,4,1,3,0,2,4,2,3,0};
	static int[] result= new int[arr.length];
	public static void main(String[] args) {
		
		System.out.print("기존 => ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("\n");
		
		// 가장 큰 값 찾기
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		

		int count[] = new int[max+1];
		//각 값의 갯수 담기
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
//		count = asc(count);
		count = desc(count);
		
		//자리 찾아주기
		for (int i = arr.length-1; i >=0; i--) {
			result[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
			print();
		}
		

		System.out.print("정렬 후 => ");
		print();
		
		
		
	}
	private static int[] desc(int[] count) {
		
		//누적으로 바꾸기
		for (int i = count.length-1 ; i>0; i--) {
			count[i-1]+=count[i];
		}
		return count;
	}
	
	private static int[] asc(int [] count) {

	
		
		//누적으로 바꾸기
		for (int i = 1; i<count.length; i++) {
			count[i]+=count[i-1];
		}
		return count;
		
	}
	
	
	private static void print() {
		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j]+" ");
		}
		System.out.println("\n");
		
	}
	
}

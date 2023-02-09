
public class BubbleSort {
	static int arr[] = {1,4,3,5,2};
	
	public static void main(String[] args) {
		
		System.out.print("기존 => ");
		print();
//		asc();
		desc();
		
	}
	private static void desc() {
		int count=1;
		System.out.println(count+". ");
		boolean flag = false;
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if(arr[j]<arr[j+1]){
					flag=true;
					System.out.println(arr[j]+"<->"+arr[j+1]);
					arr[j+1]=swap(arr[j], arr[j]=arr[j+1]);
					print();
				}
			}
			if(flag) {
				System.out.println("----------------------");
				count++;
				System.out.println(count+". ");
				flag=false;
			}
		}
		
	}
	private static void asc() {

		int count=1;
		System.out.println(count+". ");
		boolean flag = false;
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if(arr[j]>arr[j+1]){
					flag=true;
					System.out.println(arr[j]+"<->"+arr[j+1]);
					arr[j+1]=swap(arr[j], arr[j]=arr[j+1]);
					print();
				}
			}
			if(flag) {
				System.out.println("----------------------");
				count++;
				System.out.println(count+". ");
				flag=false;
			}
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

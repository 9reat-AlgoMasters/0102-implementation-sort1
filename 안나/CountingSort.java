import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CountingSort {
	static ArrayList<Integer> arr = new ArrayList<>();
 	static int[] result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("***Counting Sort***\n");
		System.out.printf("정렬할 숫자를 띄어쓰기하여 입력하세요 >> ");
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		result= new int[arr.size()];
		
		System.out.print("오름차순은 1번, 내림차순은 2번을 입력하세요 >> ");
		int k = Integer.parseInt(br.readLine());
		
		
		System.out.print("기존 => ");
		for (int j = 0; j < arr.size(); j++) {
			System.out.print(arr.get(j)+" ");
		}
		System.out.println("\n");
		
		// 가장 큰 값 찾기
		int max=0;
		for (int i = 0; i < arr.size(); i++) {
			if(max<arr.get(i)) {
				max=arr.get(i);
			}
		}
		
		

		int count[] = new int[max+1];
		//각 값의 갯수 담기
		for (int i = 0; i < arr.size(); i++) {
			count[arr.get(i)]++;
		}
		if(k==1) {
			count = asc(count);
		}else {
			count = desc(count);
			
		}
		
		//자리 찾아주기
		for (int i = arr.size()-1; i >=0; i--) {
			result[count[arr.get(i)]-1]=arr.get(i);
			count[arr.get(i)]--;
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

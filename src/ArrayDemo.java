import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[]array= {1,2,3,4,5,6,7,8,9,4,2,8};
//		System.out.println("Before Sorting");
//		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("오름차순 소팅 : "+Arrays.toString(array));

		System.out.print("내림차순 소팅 : ");		
		System.out.print("[");
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]+",");
		}System.out.print("]");
	}
}
// 오름차순 소팅, 내림차순 소팅
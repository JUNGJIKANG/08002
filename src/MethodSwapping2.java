
public class MethodSwapping2 {
	public static void main(String[] args) {
	int []array=new int[] {5,9};
	System.out.println("Before Swap:a="+array[0]+"\t"+"b="+array[1]);
	swap(array);
	System.out.println("After Swap:a="+array[0]+"\t"+"b="+array[1]);
	}
	static void swap(int []array) {
		System.out.println("In method Before Swap:c="+array[0]+"\t"+"d="+array[1]);
		int temp=array[0]; array[0]=array[1]; array[1]=temp;
		System.out.println("In method After Swap:c="+array[0]+"\t"+"d="+array[1]);
	}
}


public class MethodSwapping {
	public static void main(String[] args) {
	int a=5, b=9;
	System.out.println("Before Swap:a="+a+"b="+b);
	swap(a,b);
	System.out.println("After Swap:a="+a+"b="+b);
	}
	static void swap(int c, int d) {
		System.out.println("In method Before Swap:c="+c+"d="+d);
		int temp=c; c=d; d=temp;
		System.out.println("In method After Swap:c="+c+"d="+d);
	}
}

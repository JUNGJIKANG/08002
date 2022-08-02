
public class MethodDemo4 {
	public static void main(String[] args) {
		int original=5;
		System.out.println("Before calling Method, original="+original);
		mymethod(original);
		System.out.println("After calling Method, original="+original);
		}
		static void mymethod(int target) { //int target=origianl
			System.out.println("in method, target=" +target);
			target=100;
			System.out.println("in method, target=" +target);		
		}
}


public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("Program is Starting...");
		MethodDemo md=new MethodDemo();
		md.makeSum(); //이 부분을 주석처리하면 한번도 일을 하지 않는다.
		md.makeSum();
		System.out.println("Program is Over...");
	}

		void makeSum() { //call by name
		System.out.println("Method is Starting");
		int sum=0;
		for(int i=1; i<101; i++) {
			sum+=i;
		}
		System.out.println("sum="+sum);
		System.out.println("Method is Over");
		}
}


public class MethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Program is Starting...");
		MethodDemo2 md=new MethodDemo2();
		int start=1, last=100;
		int result=md.makeSum(start, last);
		System.out.println(start+"부터"+last+"까지의 합은"+result);
		start=30, last=50;
		result=md.makeSum(start,last);
		System.out.println(start+"부터"+last+"까지의 합은"+result);
		System.out.println("Program is Over");
		}
}
//call by value과 시작, 종료값을 주는 코딩

public class VariableArguments {
	public static void main(String[] args) {
		mymethod(1,2,3,4,5); //넘어가는 변수를 argument
	}
	static void mymethod(int...array) { //받는 변수를 parameter 주고 받는 형질은 동일해야함. 배열의 개념을 이해하면 좋은데 배열을 줄 수는 없으니 []이 아닌 ...으로 표현
		
	}
}

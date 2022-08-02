
public class MethodDemo3 {
	public static void main(String[] args) {
//		System.out.println(mymethod(50));
//	}
		static Student mymethod() {
			Student jikang=new Student();
			jikang.name="정지강";
			jikang.age=26;
			return jikang;
		}
//		static int[]mymethod() {
//			return new int[]{5,9,4,5,6,7,8,9};
//		}
//	static String mymethod(int su){ //문자를 return할 땐 String, 숫자를 return할 땐 int, long(긴 숫자), double(소수점), float 등 return값과 형변환이 맞아야한다.
//	if(su%2==0)return "Hello";	//long으로 넘길 땐 반드시 마지막에 L, return은 한번밖에 못한다. return은 하나밖에 못하고 두 번도 안되나 방법은 있다.
//	else return "World"; 
}
}

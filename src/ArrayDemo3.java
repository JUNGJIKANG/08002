import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
//		String []array={"Hello", "World", "정지강"} ;
//		for(int i=0; i<array.length; i++)		{
//			System.out.println(array[i]);
//		}

//		int[]array= {1,2};
//		array=new int[3];
//		array[2]=3; //배열은 resizing이 안되기 때문에 새 주소로 생성해야한다.

		int[]original= {1,2,3,4,5};
		int[]target= {10,9,8,7,6,5,4,3,2,1};
//		System.arraycopy(original, 2, target, 0, 3); //original의 3,4,5를 target의 10,9,8로 덮어쓴다는 의미이다.
//		System.out.println(Arrays.toString(target));
//		original[2]=100;
//		System.out.println(Arrays.toString(target));
		System.arraycopy(original, 0, target, 9, 5); //오류나는 코딩, 넘어가는 숫자에 입력 불가능.
	}
}
//배열 사용시 주의할 점
import java.util.Scanner;

public class 성적관리프로그램 {
	public static void main(String[] args) {
	System.out.println("성적관리 프로그램 시작.");
	Student jikang=new Student();
	Input.input(jikang); //출력할 학생의 정보 입력
	Calc.calc(jikang); 
	Output.output(jikang);
	System.out.println("성적관리 프로그램 끝.");
	}
}
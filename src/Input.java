import java.util.Scanner;

public class Input {
	static void input(Student student) { //학생의 정보를 입력
		Scanner sc=new Scanner(System.in);
		System.out.print("name:"); student.name=sc.nextLine();
		System.out.print("hakbun:"); student.hakbun=sc.nextLine();
		System.out.print("korean:"); student.kor=sc.nextInt(); sc.nextLine();
		System.out.print("english:"); student.eng=sc.nextInt();
		System.out.print("math:"); student.mat=sc.nextInt();
	}
}

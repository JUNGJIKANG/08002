import java.util.Scanner;

public class 성적관리프로그램2 {
	public static void main(String[] args) {
	System.out.println("성적관리 프로그램 시작.");
	Student jikang=new Student();
	input(jikang); //출력할 학생의 정보 입력
	calc(jikang); 
	output(jikang);
	System.out.println("성적관리 프로그램 끝.");
	}
	static void output(Student student) {
		System.out.println("                  부산정보산업대학교 성적관리프로그램");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",
							student.hakbun, student.name, student.kor, student.eng, student.mat,
							student.tot, student.avg, student.grade);
	}
	static void calc(Student student) { //학생의 성적을 계산
		student.tot=student.kor+student.eng+student.mat;
		student.avg=student.tot/3;
		student.grade=(student.avg>=100&&student.avg>=90)?'A':
						(student.avg>=80)?'B':
							(student.avg>=70)?'C':
								(student.avg>=60)?'D':'F';
	}
	static void input(Student student) { //학생의 정보를 입력
		Scanner sc=new Scanner(System.in);
		System.out.print("name:"); student.name=sc.nextLine();
		System.out.print("hakbun:"); student.hakbun=sc.nextLine();
		System.out.print("korean:"); student.kor=sc.nextInt(); sc.nextLine();
		System.out.print("english:"); student.eng=sc.nextInt();
		System.out.print("math:"); student.mat=sc.nextInt();
	}
}
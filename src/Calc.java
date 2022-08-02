
public class Calc {
	static void calc(Student student) { //학생의 성적을 계산
		student.tot=student.kor+student.eng+student.mat;
		student.avg=student.tot/3;
		student.grade=(student.avg>=100&&student.avg>=90)?'A':
						(student.avg>=80)?'B':
							(student.avg>=70)?'C':
								(student.avg>=60)?'D':'F';
	}
}

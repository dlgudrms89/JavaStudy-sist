/*
 * 
 */
import java.util.Scanner;
public class 조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor=scan.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math=scan.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng=scan.nextInt();
		
		int total=kor+math+eng;
		double avg=total/3.0; //더블 계산할 때는 항상 실수(소수)로
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f ",avg); //%.2f -> 소수점 이하 두자리까지 출력
		/*
		 * 	\n => new line
		 * 	\t => 일정 간격을 띌 때
		 */
		// 학점
		if(kor>=90&&kor<=100)
			System.out.println("국어 학점 : A");
		if(kor>=80&&kor<90)
			System.out.println("국어 학점 : B");
		if(kor>=70&&kor<80)
			System.out.println("국어 학점 : C");
		if(kor>=60&&kor<70)
			System.out.println("국어 학점 : D");
		if(kor<60)
			System.out.println("국어 학점 : F");
		
	}

}

/*
 * 	산술연산자
 * 		(+, -, *, /, %)
 * 		+,-,* : 자동형변환
 * 		10+20.5 => 30.5
 * 
 * 		'A'+5 = 70
 * 
 * 		int a=10.5+10.5; ==>double이 아니라 int이므로 에러
 * 		int a=(10.5+10.5) //값:21
 * 		int a=(int)10.5+(int)10.5 //값:20
 * 
 * 		/(나누기)
 * 		1) 0으로 나눌 경우 에러
 * 			10/0 x
 * 		2) 정수/정수=정수
 * 			10/3=>3
 * 		
 * 		%(나머지) : 결과값에 왼쪽 부호가 남는다
 * 				5%2=1, -5%2=-1, -5%-2=-1, 5%-2=1
 * 		
 * 		41,42,43,64,67,72,74,92,93페이지 보기
 */
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=85;
		int eng=78;
		int math=80;
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		System.out.printf("평균 : %.2f\n",avg); //소수점 이하 2자리까지 나옴
		// 서식 : %c(문자), %d(정수), %f(실수), %s(문자열), %5d(5칸을 띄어라), %-5d(뒷칸을 띄움)
		System.out.println("5%2="+ 5%2);
		System.out.println("-5%2="+ -5%2);
		System.out.println("5%-2="+ 5%-2);
		System.out.println("-5%-2="+ -5%-2);
		
		System.out.println("5/2="+5/2);
		//System.out.println("10/0="+10/0)); 에러
	}

}

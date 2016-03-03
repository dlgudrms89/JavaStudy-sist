/*
 * 	단항연산자 (증감(++, --_, 부정(!))
 * 	1) 증감연산자
 * 		전치연산
 * 		형식) int a=10;
 * 			int b=++a;
 * 			=> a를 1개 증가
 * 			=> 증가된 값을 b에 대입
 * 		후치연산
 * 			int a=10;
 * 			int b=a++;
 * 			=> a값을 b에 먼저 대입
 * 			=> a값을 1개 증가
 * 	2) 부정연산자(조건문 =>if)
 * 		boolean bCheck=false;
 * 		bCheck=!bCheck;
 * 		bCheck=true;
 * 
 * 	이항연산자
 * 	1)산술연산자 (+,-,*,/,%)
 * 		=> 형변환(=>연산시 큰 데이터로 변환)
 * 			int+long=long
 * 			int+int+double=double
 * 			*int 이하는 연산시 => int
 * 		=> /
 * 			0으로 나누면 에러
 * 			정수/정수=정수(실수점을제외, 5/2=2)
 * 		=> %
 * 			남는 값을 항상 왼쪽편의 부호를 유지
 * 			-5%-2==>-1
 * 	2)관계연산자(==,!=,<,>,<=,>=)
 * 		결과값 : true, false(boolean)
 * 		 		
 * 	3)논리연산자(&&,||)
 * 		&& ==> 양쪽에 true => true
 * 		|| ==> 한쪽에만 true => true 
 * 	4)대입연산자(=,+=,-=)
 * 		int a=10;
 * 		a+=1 ==> a=a+1
 * 		a-=1 ==> a=a-1
 */
//년도를 입력 받아서 윤년인지 여부를 확인
/*
 * 	4년마다
 * 	100년마다 윤년에서 제외
 * 	400년마다 윤년
 * 
 * 	if((year%4==0&&year%100!=0)||(year%400==0))
 */
/*
 * 	제어문
 * 		if(조건문)
 * 		형식)
 * 			if(조건문)
 * 			{
 * 				//조건문이 true일 경우에 수행하는 문장
 * 			}
 * 			else if(조건문)
 * 			{
 * 				//조건문이 true일 경우에 수행하는 문장
 * 			}
 * 			else
 * 			{
 * 				조건문이 false일 경우에 처리하는 문장
 * 			}
 * 			*{}이 없는 경우에는 바로 밑의 한 문장만 제어한다.
 * 
 */
import java.util.Scanner;
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year=scan.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0))
			System.out.println(year+"년도는 윤년입니다.");
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
		
	}

}

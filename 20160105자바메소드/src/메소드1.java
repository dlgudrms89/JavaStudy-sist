/*
 * 	메소드 : 한개의 기능을 수행하는 명령문의 집합
 * 		  ======= (재사용이 가능)
 * 		형식)
 * 			결과값(데이터형) 메소드형(입력값.....)
 * 			{
 * 				처리
 * 				결과값을 돌려준다
 * 				return 결과값 (void일 때는 결과값이 없는 메소드이므로 생략 가능)
 * 			}
 * 
 * 			호출 ==> 메소드형(입력값)
 * 			
 * 			결과값 		입력값
 * 			============
 * 			O		X
 * 			O		X
 * 			X		O
 * 			X(void)	X()
 * 			
 * 			=> void main(String[] args)
 * 				결과값(X) 매개변수(O)
 * 				double random()
 * 				결과값(O) 매개변수(X)
 * 				int nextInt()
 * 				결과값(O) 매개변수(X)
 * 
 * 
 */
import java.util.Scanner;
public class 메소드1 {
	// 매개변수(사용자 입력값), 리턴형(처리 결과값)
	static int plus(int a, int b)
	{
		int c=a+b;
		return c;
	}
	static int minus(int a, int b)
	{
		int c=a-b;
		return c;
	}
	static int gop(int a, int b)
	{
		int c=a*b;
		return c;
	}
	static double div(int a, int b)
	{
		double d=a/(double)b;
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 단일 데이터 저장(변수) 값 입력
		 * = 직접입력
		 * int a=10;
		 * int a=scan.nextInt()
		 * int a=(int)(Math.random()*100)
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("1' 정수입력 : ");
		int a=scan.nextInt();
		System.out.println("2' 정수입력 : ");
		int b=scan.nextInt();

		// +
		int res=plus(a,b);
		System.out.println("덧셈 : "+res);
		// -
		int res2=minus(a,b);
		System.out.println("뺄셈 : "+res2);
		// *
		int res3=gop(a,b);
		System.out.println("곱셈 : "+res3);
		// /
		double res4=div(a,b);
		System.out.println("나눗셈 : "+res4);
	}

}

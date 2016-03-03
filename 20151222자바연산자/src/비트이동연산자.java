/*
 * 	프로그램 구현 방법
 * 		1) 데이터 저장 => 변수
 * 		2) 데이터 연산처리 => 연산자
 * 		3) 처리한 결과 출력 
 * 			=> System.out.println() : 자동으로 줄 바꿈
 * 			=> System.out.print() : 붙어서 나옴
 * 			=> System.out.printf() : 서식을 가지고 있는 출력
 *
 * 	비트이동연산자(<<,>>)
 * 	10<<2 ==> 이진법으로 변환 후 0을 2개 붙여라(왼쪽으로 2칸 이동하라)
 * 	10 => 1010(이진법) => 101000 => 40(십진법)
 * 	
 * 	10>>2 => 1010 => 10 => 2
 */
public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-5d%-5d\n\n",10,20); //뒤쪽으로 5칸 띄어쓰기
		
		int a=10;
		int b=2;
		int c=a<<b;
		int d=a>>b;
		System.out.println("10의 이진법 = "+(Integer.toBinaryString(a))); //a의 이진법
		System.out.println("c="+c);
		System.out.println("d="+d);
		
	}

}

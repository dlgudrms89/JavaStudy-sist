/*
 * 	변수 : 변경이 가능한 값
 * 	= 단일데이터 변수
 * 	= 여러개 저장 변수 (배열, 클래스)
 * 
 * 1) 변수 형식
 * 	     데이터 형(자료형) 변수명=값
 * 	  =========
 * 		정수 : byte(1), short(2), int(4), long(8) 
 * 		실수 : float(4), double(8)
 * 		문자 : char(2)
 * 		논리 : boolean(1)
 * 
 * 		변수 만드는 방법
 * 		= 알파벳, 한글로 시작
 * 		= 숫자 사용이 가능 (앞에 사용 금지)
 * 		= 특수문자($,_)
 * 		= 키워드는 사용할 수 없다
 * 	2) 데이터형 크기
 * 		byte < char < int < long < double
 * 				short			float
 * 	3) 형변환
 * 		int a=300;
 * 		int b=300;
 * 		byte c=(byte)(a+b) ==> 88 (이진법이 들어가는대로 끊으면 88이 나옴)
 */
public class 자바변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=300;
		int b=300;
		byte c=(byte)(a+b);
		System.out.println("c="+c);
	}
}

package 자바기초;
/*
 * 	자료형 : 메모리 크기 ==> 데이터 저장시마다 메모리 크기를 결정
 *  (1byte, 2byte, 4byte, 8byte)
 *  
 *  1) 정수 저장
 *  	byte (1byte) -128~127
 *  	short(2byte) -32768~32767
 *  	int (4byte) -21억4천~21억4천 (default)
 *  	long (8byte) (뒤에 L을 붙여서 int와 구분)
 *  2) 실수 저장
 *  	float (4byte) 10.5F => 소수점 6자리
 *  	double (8byte) 10.5 (default) => 소수점 15자리
 *  3) 문자 저장 (2byte) 'A', '홍' => -값이 없다 (0~65535)
 *  		싱글바이트 (1byte) : ASC
 *  		멀티바이트 (2byte) : Unicode
 *  4) 논리 저장
 *  	boolean (1byte) => true/false
 *  5) 참조 ==> 클래스, 배열
 */
public class 자바자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d=123456.78F;
		int i=(int)((d-123456)*100);
		System.out.println(i); //double이면 결과값 77, float이면 78
		
		System.out.println((int)'A'); //65 (형변환)
		System.out.println((char)67); //C
		System.out.println(10.5);
		System.out.println((int)10.5); //10
		
		/*
		 *  10 + 10.5 ==> 20.5 (크기가 커지는 쪽으로 형 변환됨)
		 *  'A'+1==>66 (char=2byte, int=4byte => int로 바뀜)
		 *  
		 *  
		 *  byte<short<int<long<float<double
		 *       char
		 *  int크기 이하의 덧셈은 전부 int가 됨
		 *  char+int = int
		 *  char+char = int
		 *  byte+byte = int
		 */
		
		byte b1=100;
		byte b2=30;
		//byte b3=b1+b2; //byte에 들어가지 않는 크기라서 오류
		byte b3=(byte)(b1+b2);
		System.out.println(b3); //결과값 -126
		
		int i3=(int)(b1+b2);
		System.out.println(i3); //130
	}

}

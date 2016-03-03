
public class 자바자료형 {
	/*
	 * 	자료형
	 * 	 정수형
	 * 	  byte
	 * 	  short
	 * 	  int
	 * 	  long
	 * 	 실수형
	 * 	 문자형
	 *	 논리형
	 *
	 *	1) 단일 데이터를 저장하는 메모리의 별칭 : 변수
	 *		변수 : 변하는 값(언제든지 필요시마다 변경해서 사용이 가능)
	 *		상수 : 변하지 않는 값(고정값이 필요)
	 *		
	 *		=> 변수 사용법
	 *			메모리_크기선언 변수명_설정 = 값
	 *			ex) {
	 *				 int a = 10; //같은 블록{}상에서 같은 이름의 변수는 사용 할 수 없다
	 *				 int a = 20;
	 *				}			
	 *				선언 후에 나중에 값을 대입
	 *				int a;
	 *				a =10;
	 *				int a, b, c;
	 *				int a=10, b=20, c=30;
	 *
	 *			=> 변수명 만들기(식별자)
	 *				1) 알파벳이나 한글로 시작(단 알파벳은 대소문자를 구분)
	 *				2) 숫자 사용이 가능(단 앞에 사용을 할 수 없다)
	 *				3) 특수문자를 사용 할 수 있다($,_)
	 *				4) 키워드는 사용할 수 없다(자바에서 이미 사용중인 단어 : int, long 등)
	 *				5) 변수의 길이는 제한이 없다
	 *
	 *				******문법x 자바개발자들끼리의 약속
	 *				1) 클래스명 첫자는 대문자 (Main)
	 *				2) 변수, 메소드 첫자는 소문자
	 *				3) 두개 이상의 단어를 이용할 때 두번째 시작은 대문자(헝가리언식 표현법)
	 *					로 시작 또는 언더바_(MainClass, Main_Class)
	 *
	 *			=> 자료형의 변환
	 *				자료형의 크기
	 *				byte < short < int < long < float < double
	 *						char
	 *				=> 자료형 작게
	 *					(int)10.5 => (double(8)=>int(4))
	 *					강제 형변환(down-casting)
	 *				=> 자료형 크게
	 *					(double)10 => (int(4)=>double(8))
	 *					==> 자동형변환 (연산 수행시마다)
	 *					'A'+1
	 *					1) 'A' => 65
	 *					2) 65+1 => 66
	 *				=> int a=10000000000(백억)(숫자를 먼저 인식하고 그 다음 a를 인식, 에러를 먼저 출력)
	 *				   => long a=10000000000L
	 *	
	 *				int크기 이하의 덧셈은 전부 int가 됨
	 *				char+int = int
	 *				char+char = int
	 *				short+short = int
	 *				byte+int = int
	 *				byte+byte = int
	 *				int보다 큰 거는 큰 걸 따라감
	 *				int+long = long
	 *				double+int = double
	 *				float+int = float
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue =127;
		short shortValue = 32767;
		int intValue = 2140000000;
		long longValue = 21400000000000L;
		float floatValue=10.5F;
		double doubleValue=10.5;
		char charValue='홍';
		boolean booleanValue=true;
		
		System.out.println("byteValue="+byteValue);
		System.out.println("shortValue="+shortValue);
		System.out.println("intValue="+intValue);
		System.out.println("longValue="+longValue);
		System.out.println("floatValue="+floatValue);
		System.out.println("doubleValue="+doubleValue);
		System.out.println("charValue="+charValue);
		System.out.println("booleanValue="+booleanValue);
		
	}

}

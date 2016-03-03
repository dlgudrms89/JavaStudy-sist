/*
 * 	문자열 ==> 문자 여러개를 묶어서 사용
 * 			======
 * 			char[] ==> 조작해서 만든 클래스 : String
 * 	1) 사용 방식
 * 		String 변수명 = "값";
 * 		====== ===
 * 		  클래스         객체      객체변수값=> 객체 : 사용자 정의 데이터형에 대한 변수명
 * 		
 * 		String 변수명 = new String("값");
 * 					====
 * 					새로운 메모리 생성 => 저장
 * 				C언어에서는 malloc() => free()		
 * 		String str=new String("java")
 * 
 * 		자바 메모리
 * 		=======================
 * 		  method영역
 * 		=======================
 * 		  stack => 메모리에 의해 저장 (지역변수, 매개변수)
 * 		=======================
 * 		  head => 개발자가 저장 (new를 이용해서 할당)
 * 		=======================	
 * 
 * 		String str=new String("java");
 * 		==========  ==============
 * 			str			(java)
 * 			100			 100
 * 		==========  ==============
 * 
 * 		String : 데이텨형, 기능
 * 		1) equals : 문자열 비교
 * 		2) length : 문자의 갯수
 * 		3) substring : 문자 분해
 * 		4) split : 문자 분해
 * 		5) startsWith, endsWith : 자동 완성기
 * 		6) trim : 좌우 공백 제거
 * 		7) indexOf, lastIndexOf : 원하는 위치의 문자 위치
 * 		8) replace : 다른 값을 변경
 * 		9) valueOf : 모든 데이터형을 문자열로 변경
 * 		10) charAt(0) : 해당 문자열에서 문자 한개를 가져올 때 
 * 
 */
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2=new String("Hello"); //new가 붙으면 새로운 메모리
		if(str==str1)
		{
			System.out.println("str과 str1은 같다(주소)");
		}
		if(str!=str2) //주소값이 같은지 비교
		{
			System.out.println("str과 str2는 다르다");
		}
		
		if(str.equals(str2)) //문자열이 같은지 비교
		{
			System.out.println("str==str2");
		}
		if(str.equalsIgnoreCase(str2))//ignore는 대소문자 구분을 하지 않음
		{
			System.out.println("str==str2 대소문자 무시");
		}
	}

}

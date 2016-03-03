/*
 * 	단일if
 * 		if(조건문)
 * 			문장1
 * 
 * 		if(조건문)
 * 			문장1
 * 			문장2		//두개 동시에 제어하지 않음
 * 
 * 		if(조건문)
 * 		{
 * 			문장1
 * 			문장2
 * 		}
 */
public class 조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		if(ch>='A'&&ch<='Z') //char는 연산자가 들어가면 자동으로 숫자로 바뀜
		{
			System.out.println(ch+"=대문자");
		}
		if(ch>='a'&&ch<='z')
		{
			System.out.println(ch+"=소문자");
		}
	}

}

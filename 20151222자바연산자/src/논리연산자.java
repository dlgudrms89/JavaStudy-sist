/*
 * 	논리연산자 ==> 결과값(true,false) => boolean
 * 	조건 &&조건
 *  ===========================
 * 					&&		||
 *  ===========================
 *  true true		true	true
 *  ===========================
 *  true false		false	true
 *  ===========================
 *  false true		false	true
 *  ===========================
 *  false false		false	false
 *  ===========================
 *  
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		boolean result=(a<b&&++b==a);
		System.out.println("result="+result);
		System.out.println("a="+a);
		System.out.println("b="+b); //결과값:9, 앞의 조건이 false면  뒤의 조건은 연산하지 않고 빠져나감
		
		b=9;
		result=(a>b||++b==a);
		System.out.println("b="+b); //앞의 조건이 true면 뒤의 조건은 연산하지 않음
		
	}

}

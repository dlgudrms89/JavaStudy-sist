/*
 * 	관계연산자 ==> 결과값(true/false) boolean
 * 		== 같다
 * 		!= 같지 않다
 * 		< 작다
 * 		> 크다
 * 		<= 작거나 같다
 * 		>= 크거나 같다
 */
public class 관계연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		boolean result=(a==++b);
		System.out.println("result="+result);
		
		result=(a==b++);
		System.out.println("result="+result);
		
		result=(a==b);
		System.out.println("result="+result);
		
		int a2=10;
		int b2=9;
		boolean result2=(a2!=b2);
		System.out.println("result2="+result2);
		b2++;
		result=(a2!=b2);
		System.out.println("result2="+result2);
		
		int c2=++b2;
		System.out.println(b2);
		result2=(a2!=c2);
		System.out.println("result2="+result2);
		
	}

}

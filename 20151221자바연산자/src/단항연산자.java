
public class 단항연산자 {
/*
 * 	=> 단항연산자
 * 	++,-- 증감 연산자
 * 		++,--
 * 		a++(후치연산자), ++a(전치연산자)
 * 		후치연산자 : 다른 연산 후에 증가
 * 		전치연산자 : 증가 후에 다른 연산
 * 		int a=10
 * 		int b=a++; (a를 b에 대입하고 증가해라)
 * 
 * 		int a=10;
 * 		int b=++a; (a를 증가시키고 b에 대입하라)
 * 
 * 	! 부정연산자
 * 	(type) 형변환연산자
 * 	~반전연산자
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		System.out.println("a="+a); //11
		System.out.println("b="+b); //11
		
		int aa=10;
		int bb=a++; //a를 b에 대입(b=10) 후 a 증가(a=11) 
		System.out.println("aa="+aa); //11
		System.out.println("bb="+bb); //10
		
		int a3=10;
		int b3=--a3;
		System.out.println("a3="+a3); //9
		System.out.println("b3="+b3); //9
		
		int a4=10;
		int b4=a4--;
		System.out.println("a4="+a4); //9
		System.out.println("b4="+b4); //10
	}

}

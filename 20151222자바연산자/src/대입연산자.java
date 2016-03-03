/*
 * 	대입연산자
 * 	=
 * 	+=
 * 	-=
 * 	*=
 * 	/=
 * 	op=
 * 
 * 	int a=10;
 * 	======================
 * 	a+=1	a=a+1
 * 	======================
 * 	a-=1	a=a-1
 * 	======================
 * 	a*=3	a=a*3
 * 	======================
 * 	a/=3	a=a/3
 * 	======================
 * 	
 * 	======================
 */
public class 대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a+=5;
		System.out.println("a="+a);
		a-=5;
		System.out.println("a="+a);
		a*=2;
		System.out.println("a="+a);
		a/=3;
		System.out.println("a="+a);
		a<<=2;
		System.out.println("a="+a); //6*2^2
		a>>=3;
		System.out.println("a="+a); //24/2^3
	}

}

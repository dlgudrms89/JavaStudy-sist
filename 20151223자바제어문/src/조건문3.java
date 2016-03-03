/*
 * 	3,5,7의 배수
 */
public class 조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=21;
		if(num%3==0)
		{
			System.out.println(num+"은(는) 3의 배수");
		}
		if(num%5==0)
		{
			System.out.println(num+"은(는) 5의 배수");
		}
		if(num%7==0)
		{
			System.out.println(num+"은(는) 7의 배수");
		}
		System.out.println();
		
		int num2=10;
		if(num2%2!=0)
			System.out.println(num2+"은(는) 짝수");
			System.out.println("Program End");	//{}가 없으면 if문 다음 문장만 if
		System.out.println();
		if(num2%2==0)
		{
			System.out.println(num2+"은(는) 짝수");
			System.out.println("Program End");
		}
	}

}

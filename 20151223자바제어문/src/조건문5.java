/*
 *	선택if문
 *		형식)
 *			if(조건문)	조건문(true/false)
 *				문장1 ==> true일 때 수행
 *			else
 *				문장2 ==> false일 때 수행
 *
 */
import java.util.Scanner;
public class 조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("1~100사이의 정수 입력 : ");
		int num=scan.nextInt();
		if(num<1||num>100)
			System.out.println("잘못된 입력");
		else //정상입력이면
		{
			System.out.println("정상입력입니다");
			
			if(num%2==0)
				System.out.println(num+"은(는) 짝수입니다");
			else
				System.out.println(num+"은(는) 홀수입니다");
		}
		
			
	}

}

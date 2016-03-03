/*
 * 	제어문 : 프로그램에 맞게 제어를 하는 프로그램
 * 	조건문
 *		단일 if 
 * 		1) 형식
 * 			=> if(조건문)
 * 				문장 ====> 조건문이 true면 문장수행
 * 					===> 조건문이 false면  수행x
 * 			=> 여러개의 문장을 동시에 제어
 * 				if(조건문)
 * 				{
 * 					문장1
 * 					문장2
 * 				}
 * 				***** 자바에서 제어문은 {}이 없는 경우에 바로 밑에 있는 문장만 제어
 * 			=> 조건이 true, false일 대 다른 문장을 수행
 * 				if(조건문)
 * 					문장1
 * 				else
 * 					문장2
 * 
 * 				
 */
import java.util.Scanner;
//Scanner : 키보드 입력값을 받는 경우
public class 조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 Math.random() -> 0.0~0.99
		int rand=(int)(Math.random()*100)+1;
		System.out.println("rand="+rand);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num=scan.nextInt();
		System.out.println("num="+num);
		
		int com=(int)(Math.random()*3); //0~2
		
		Scanner scan2=new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) 입력 : ");
		int user=scan2.nextInt();
		if(user==0)
		{
			System.out.println("사용자 : 가위");
		}
		else if(user==1)
		{
			System.out.println("사용자 : 바위");
		}
		else if(user==2)
		{
			System.out.println("사용자 : 보");
		}
		else
		{
			System.out.println("하라는대로 해라");
		}
		
		if(com==0)
		{
			System.out.println("컴퓨터 : 가위");
		}
		else if(com==1)
		{
			System.out.println("컴퓨터 : 바위");
		}
		else
		{
			System.out.println("컴퓨터 : 보");
		}
		
		if(user<0||user>2)
		{
			System.out.println("사용자 패배");
		}
		else if(user>com)
		{
			System.out.println("사용자 승리");
		}
		else if(user<com)
		{
			System.out.println("사용자 패배");
		}
		else if(user==com)
		{
			System.out.println("비김");
		}
		
		/*
		 * 		컴퓨터-사용자
		 * 		==> USER : -1,2
		 * 		==> COM : -2,1
		 * 		==> DRAW : 0
		 */
		
		int res=com-user;
		if(res==-1||res==2)
		{
			System.out.println("사용자가 이겼다");
		}
		else if(res==-2||res==1)
		{
			System.out.println("컴퓨터가 이겼다");
		}
		else if(res==0)
		{
			System.out.println("비겼다");
		}
		else
		{
			System.out.println("뭐하냐");
		}
	}

}

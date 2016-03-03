/*
 * 	1~100까지 난수 발생
 * 	난수를 맞추는 프로그램 
 */
import java.util.Scanner;
public class 메소드5 {
	static int getRand()
	{
		return (int)(Math.random()*100)+1;
	}
	
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		return scan.nextInt();
	}
	
	static boolean hint(int com, int user)
	{
		boolean bCheck=false;
		
		if(com>user)
			System.out.println("업");
		else if(com<user)
			System.out.println("다운");
		else
			bCheck=true;
		return bCheck;
	}
	
	static void process()
	{
		int com=getRand();
		while(true)
		{
			int user=input();
			boolean bCheck=hint(com,user);
			if(bCheck==true)
			{
				System.out.println("게임을 다시할까요(Yes(1)/No(2)");
				Scanner scan=new Scanner(System.in);
				int regame=scan.nextInt();
				if(regame==1)
				{
					process();	//재귀호출 - 자기자신을 다시 부름
				}
				else
				{
					System.out.println("Game Over");
					System.exit(0);	//프로그램 완전 종료
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

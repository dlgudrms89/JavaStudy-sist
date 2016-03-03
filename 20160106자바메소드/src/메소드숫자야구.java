/*
 * 	기능 설정
 * 	1) 중복 없는 난수 발생
 * 	==============
 * 	2) 사용자 입력 요구
 * 	3) 난수/입력값 비교
 *  4) 힌트 설정
 * 	5) 종료여부 확인 => true(종료)
 * 	==============loop
 */
import java.util.Scanner;
public class 메소드숫자야구 {
	// 난수발생
	/*
	 * 	지역변수 : 사용범위
	 * 		지역변수는 반드시 초기화
	 * 		=> 직접 입력
	 * 			int a=10;
	 * 		=> scan.nextInt();
	 * 		=> Math.random();
	 * 	사용범위 =>{}
	 * 
	 * 	지역변수 종류
	 * 		1) 메소드 안에 선언
	 * 		2) 매개변수
	 * 		3) 누적변수, 루프변수, 스위치 변수, 플러그...
	 * 
	 */
	static int[] getRand()
	{
		int[] com=new int[3];
		int su=0; //난수 발생시 저장할 변수
		boolean bDash=false; //중복여부 확인
		for(int i=0; i<3; i++)
		{
			bDash=true;
			while(bDash) // 난수발생, 중복 학인
			{
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0; j<i; j++)
				{
					if(com[j]==su)
					{
						bDash=true; //중복이 있으면 멈추고 while문을 다시 수행(랜덤값을 다시 줌)
						break;
					}
				}
			}
			com[i]=su;
		}
		
		return com;
		/*
		 *  리턴값은 1개다
		 *  => 데이터가 여러개 = 배열, 클래스
		 */
	}
	// 사용자 입력
	static int[] userInput()
	{
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		int input=0;
		
		while(true)
		{
			System.out.println("숫자를 입력하시오");
			input=scan.nextInt();
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(input<100||input>999)
			{
				System.out.println("세자리수만 입력하시오");
				continue;
			}
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("중복된 수는 입력 불가");
				continue;
			}
			break;
		}
		
		return user;
	}
	// 비교
	static int compare(int[] com, int[] user)
	{
		int s=0, b=0;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		hint(user, s, b);
		return s;
	}
	// 힌트
	static void hint(int[] user, int a, int b)
	{
		System.out.printf("Input Number : %d-%d-%d\nResult : %dS-%dB\n"
				,user[0],user[1],user[2],a,b);
	}
	// 종료
	static boolean isEnd(int a)
	{
		boolean bCheck=false;
		if(a==3)
			bCheck=true;
		return bCheck;
	}
	// 조립
	static void process()
	{
		int[] com=getRand();
		while(true)
		{
			int[] user=userInput();
			
			for(int i=0; i<3; i++)
			{
				System.out.print(com[i]+" ");
			}
			System.out.println();
			for(int i=0; i<3; i++)
			{
				System.out.print(user[i]+" ");
			}
			System.out.println();
			int s = compare(com,user);
			if(isEnd(s))
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("게임을 다시 할까요?(Y/N)");
				String res=scan.next();
				char ch=res.charAt(0); //문자 열에서 0번째 char
				if(ch=='y')
				{
					System.out.println("새 게임이 시작되었습니다");
					process();
				}
				else
				{
					System.out.println("Game Over");
					System.exit(0);
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조립
		process();
	}

}

/*
 * 	1) 중복없는 난수(com) ==> int[] com 
 * 	2) 숫자 입력(user) ==> int[] user
 * 	3) 난수와 입력값 비교 ==> s,b
 * 	4) 힌트 ==> s, b
 * 	5) 종료 ==> s==3이면 종료
 */
import java.util.Scanner;
public class 숫자야구 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		int[] user=new int[3];
		int s,b;
		
		// 중복없는 난수발생
		int su=0;//난수저장
		boolean bDash=false;//중복확인
		for(int i=0; i<3; i++)
		{
			bDash=true;
			while(bDash)
			{
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0; j<i; j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			com[i]=su;
			System.out.println(com[i]);
		}
		
		Scanner scan=new Scanner(System.in);//user 숫자 입력
		while(true)
		{
			System.out.println("세자리 정수 입력");
			int input=scan.nextInt();
			if(input<100||input>999)
			{
				System.out.println("세자리 정수만 입력하시오");
				continue;	//for문이면 증가식으로, while문이면 조건식으로 간다.
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없다");
				continue;
			}
			
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0은 입력할 수 없다");
				continue;
			}
			
			//S,B확인
			s=0;
			b=0;
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
			
			System.out.println("S : "+s);
			System.out.println("B : "+b);
			
			if(s==3)
			{
				System.out.println("Game Over!");
				break;
			}
			
		}
	}

}

/*
 * 	연산자
 * 		단항연산자(++,--,!)
 * 		산술연산자(+,-,*,/,%)
 * 		논리연산자(&&,||)
 * 		관계연산자(==,!=,>,<,>=,<=,)
 * 		대입연산자(=,+=,-=)
 * 	제어문
 * 		조건문(if, if-else, if-else if-else)
 * 		선택문(switch-case)
 * 		반복문(for,while)
 * 		반복제어문(break,continue(while에서는 처음으로 돌아감))
 */
//숫자야구게임!!!
/*	숫자를 제시 같은 자리+숫자일치면 스트라이크, 다른자리+숫자일치면 볼
 *  3 4 5
 *   => 1 2 3
 *   	스트라이크:0-볼:1
 *   => 4 5 6
 *   	스트라이크:0-볼:2
 *   => 3 5 4
 *   	스트라이크:1-볼:2
 *   => 3 4 5
 *   	스트라이크:3-볼0 => break
 */
/*
 * 프로그램 순서
 * 1.난수발생 => 컴에서 문제를 내는 숫자3개
 * 2.사용자가 숫자 3개 입력
 * 3.입력값,난수값비교
 * 4.힌트제공
 * 5.3S확인 => 틀리면 2번으로 돌아감
 * 		=> 맞으면 break
 */
import java.util.Scanner;
public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] com={7,5,8};
		int[] user=new int[3];
		
		while(true)
		{
			System.out.println("숫자 3개를 입력하시오");
			int input=scan.nextInt();
			if(input<100||input>999)
			{
				System.out.println("잘못된입력입니다.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=(input%10);
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			//처리비교
			int s=0;
			int b=0;
			for(int i=0;i<3;i++)//com
			{
				for(int j=0;j<3;j++)//user
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
			
			System.out.printf("Input Number: %d\nResult:%dS-%dB\n",input,s,b);
			
			System.out.println("===================="); //전광판처럼 표시
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("●");
			}
			System.out.print(" B:");
			for(int i=0;i<b;i++)
			{
				System.out.print("○");
			}
			System.out.println();
			System.out.println("====================");
			
			if(s==3)
			{
				System.out.println("\"Game Over!!\"");
				// \" : 큰따옴표 표시
				System.out.println("c:\\javadev\\javaStudy");
				// \\ : 역슬래쉬 두개를 줘야 역슬래쉬가 표시됨
				break;
			}
		}
	}

}

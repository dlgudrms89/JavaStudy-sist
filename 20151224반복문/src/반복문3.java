/*
 * 	UP-DOWN게임
 */
import java.util.Scanner;
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int com=(int)(Math.random()*100)+1;//random : 0.0~0.99
		
		int count=0;//몇번만에 맞추냐
		for(;;)//무한루프
		{
			System.out.print("1~100까지 사이의 정수를 입력 : ");
			int user = scan.nextInt();
			if(user<1||user>100)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}			
			count++;
			// 비교
			if(com>user)
			{
				System.out.println("업");
			}
			else if(com<user)
			{
				System.out.println("다운");
			}
			else
			{
				System.out.println("올ㅋ");
				System.out.println("점수 : "+(100-(count*10)));
				break;
			}
		}
	}

}

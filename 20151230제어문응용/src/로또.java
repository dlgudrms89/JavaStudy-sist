/*
 * 	1~45까지 6개의 중복없는 난수 발생
 * 	사용자가 6개 입력 ==> 비교
 * 	3-->4
 * 	4-->3
 * 	5-->2
 * 	6-->1
 */
import java.util.Scanner;
public class 로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];	// 난수를 저장하는 변수
		int[] user=new int[6];
		int su=0;	//난수
		boolean bDash=false;	//중복여부확인
		
		for(int i=0; i<6; i++)
		{
			bDash=true;
			while(bDash)	//false가 될때까지 돈다(중복이 있으면 계속 돈다)
			{
				su=(int)(Math.random()*45)+1;	//난수발생
				bDash=false;
				for(int j=0; j<i; j++)	//중복체크
				{
					if(arr[j]==su)
					{
						bDash=true;
						break;	//난수가 중복되면 다시 돌고 su에 난수를 재입력
					}
				}
			}
			arr[i]=su;	//난수를 배열에 저장
		}
		System.out.println();
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<6; i++)
		{
			System.out.println("1~45 사이의 숫자를 입력하시오\n"+(i+1)+"번째 숫자 : ");
			user[i]=scan.nextInt();
			if(user[i]<1||user[i]>45)
			{
				i--;
				continue;				
			}
			
			for(int j=0; j<i; j++)
			{
				if(user[i]==user[j])
				{
					System.out.println("중복된 수를 입력할 수 없습니다.");
					i--;
					break;
				}
			}
		}
		
		int count=0;
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(arr[i]==user[j])
				{
					count++;
				}
			}
		}
		
		System.out.print("컴 :\t");
		for(int i=0; i<6; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.print("나 :\t");
		for(int i=0; i<6; i++)
		{
			System.out.print(user[i]+"\t");
		}
		System.out.println();
		switch(count)
		{
		case 6:
			System.out.println("1등!");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 4:
			System.out.println("3등");
			break;
		case 3:
			System.out.println("4등");
			break;
		default:
			System.out.println("꽝");
		}

	}

}

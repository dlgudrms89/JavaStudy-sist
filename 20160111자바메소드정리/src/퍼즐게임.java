/*
 * 	기능
 * 	1) 난수 => 배열 저장
 * 	2) 출력
 * 	3) 입력 => 정수
 *  4) 종료 => 배열의 순서
 *  5) 조립
 *  
 *  
 *  변수
 *  1) 변수의 종류
 *  				메모리 위치 	 저장시점
 *  	================================
 *  	 static		method	컴파일 시 자동
 *  	  => 공통변수,클래스변수
 *  		   클래스이름.변수명
 *  		 => 메모리 공간 1개
 *  	================================
 *  	 instance	 heap	new연산자 사용 시
 *  	  => 객체변수
 *  		   객체이름.변수명
 *  		 => new사용 갯수만큼 생성
 *  	================================
 *  	 local		stack	메소드 호출 시
 *  						(메소드 영역에서만)
 *  	  => 지역변수
 *  	================================
 */
import java.util.Scanner;
public class 퍼즐게임 {
	static int[][] panCount=new int[3][3];
	static int bRow, bCol;
	//멤버변수 => 자동으로 초기화(int=0, String=null ...)

	//난수발생
	static void getRand()
	{
		int[] temp=new int[9];
		int su=0;
		boolean bDash=false;
		for(int i=0; i<9; i++)
		{
			bDash=true;
			while(bDash)
			{
				su=(int)(Math.random()*9);
				bDash=false;
				for(int j=0; j<i; j++)
				{
					if(temp[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			temp[i]=su;
			panCount[i/3][i%3]=temp[i]; //1차원->2차원배열로 바꾸는 법
			if(su==8)
			{
				bRow=i/3;
				bCol=i%3;
			}
		}
	}
	
	//화면에 퍼즐판 출력
	static void display()
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(i==bRow&&j==bCol)
					System.out.print("\t");
				else
					System.out.print(panCount[i][j]+1+"\t");
			}
			System.out.println();
		}
	}
	
	static void process(){
		getRand();
		display();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("1~8까지 정수입력");
			int input=scan.nextInt();
			int a=0;
			int b=0;
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					if(panCount[i][j]+1==input)
					{
						a=i;
						b=j;
						break;
					}
				}
			}
			panCount[bRow][bCol]=panCount[a][b];
			panCount[a][b]=8;
			bRow=a;
			bCol=b;
			display();
			if(isEnd())
			{
				System.out.println("Game Over");
				break;
			}
		}
	}
	
	static boolean isEnd()
	{
		int k=0;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

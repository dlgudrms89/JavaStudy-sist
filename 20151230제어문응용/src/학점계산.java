import java.util.*;	//util안의 모든 클래스를 가져옴 (단,속도는 느려짐) 

public class 학점계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] dap=new char[10];
		char[] user=new char[10];
		for(int i=0; i<10; i++)
		{
			int rnd=(int)(Math.random()*2);	//0,1 난수 발생
			if(rnd==0)
				dap[i]='O';
			else
				dap[i]='X';
		}
//		for(int i=0; i<10; i++)
//		{
//			System.out.println(dap[i]+" ");
//		}
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			System.out.print("0(O),1(X) 입력 : ");
			int num=scan.nextInt();
			
			if(num==0)
			{
				user[i]='O';
			}
			else if(num==1)
			{
				user[i]='X';
			}
			else
			{
				System.out.println("0 또는 1을 입력하시오");
				i--;
			}			
		}
		
		int count=0;
		for(int i=0; i<10; i++)
		{
			if(dap[i]==user[i])
			{
				count++;
			}
		}
		//내 입력값과 정답 비교 확인
		for(int i=0; i<10; i++)
		{
			System.out.print(dap[i]+" ");
		}
		System.out.println();
		for(int i=0; i<10; i++)
		{
			System.out.print(user[i]+" ");
		}
		System.out.println();
		//점수 및 학점 출력
		System.out.println("점수 : "+(count*10));
		char hak='A';
		switch(count)
		{
		case 10:
		case 9:
			hak='A';
			break;
		case 8:
			hak='B';
			break;
		case 7:
			hak='C';
			break;
		case 6:
			hak='D';
			break;
		default:
			hak='F';
		}
		System.out.println("학점 : "+hak);
	}

}

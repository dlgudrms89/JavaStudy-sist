/*
 * 	���
 * 	1) ���� => �迭 ����
 * 	2) ���
 * 	3) �Է� => ����
 *  4) ���� => �迭�� ����
 *  5) ����
 *  
 *  
 *  ����
 *  1) ������ ����
 *  				�޸� ��ġ 	 �������
 *  	================================
 *  	 static		method	������ �� �ڵ�
 *  	  => ���뺯��,Ŭ��������
 *  		   Ŭ�����̸�.������
 *  		 => �޸� ���� 1��
 *  	================================
 *  	 instance	 heap	new������ ��� ��
 *  	  => ��ü����
 *  		   ��ü�̸�.������
 *  		 => new��� ������ŭ ����
 *  	================================
 *  	 local		stack	�޼ҵ� ȣ�� ��
 *  						(�޼ҵ� ����������)
 *  	  => ��������
 *  	================================
 */
import java.util.Scanner;
public class ������� {
	static int[][] panCount=new int[3][3];
	static int bRow, bCol;
	//������� => �ڵ����� �ʱ�ȭ(int=0, String=null ...)

	//�����߻�
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
			panCount[i/3][i%3]=temp[i]; //1����->2�����迭�� �ٲٴ� ��
			if(su==8)
			{
				bRow=i/3;
				bCol=i%3;
			}
		}
	}
	
	//ȭ�鿡 ������ ���
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
			System.out.println("1~8���� �����Է�");
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

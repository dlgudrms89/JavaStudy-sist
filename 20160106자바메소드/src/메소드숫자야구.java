/*
 * 	��� ����
 * 	1) �ߺ� ���� ���� �߻�
 * 	==============
 * 	2) ����� �Է� �䱸
 * 	3) ����/�Է°� ��
 *  4) ��Ʈ ����
 * 	5) ���Ῡ�� Ȯ�� => true(����)
 * 	==============loop
 */
import java.util.Scanner;
public class �޼ҵ���ھ߱� {
	// �����߻�
	/*
	 * 	�������� : ������
	 * 		���������� �ݵ�� �ʱ�ȭ
	 * 		=> ���� �Է�
	 * 			int a=10;
	 * 		=> scan.nextInt();
	 * 		=> Math.random();
	 * 	������ =>{}
	 * 
	 * 	�������� ����
	 * 		1) �޼ҵ� �ȿ� ����
	 * 		2) �Ű�����
	 * 		3) ��������, ��������, ����ġ ����, �÷���...
	 * 
	 */
	static int[] getRand()
	{
		int[] com=new int[3];
		int su=0; //���� �߻��� ������ ����
		boolean bDash=false; //�ߺ����� Ȯ��
		for(int i=0; i<3; i++)
		{
			bDash=true;
			while(bDash) // �����߻�, �ߺ� ����
			{
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0; j<i; j++)
				{
					if(com[j]==su)
					{
						bDash=true; //�ߺ��� ������ ���߰� while���� �ٽ� ����(�������� �ٽ� ��)
						break;
					}
				}
			}
			com[i]=su;
		}
		
		return com;
		/*
		 *  ���ϰ��� 1����
		 *  => �����Ͱ� ������ = �迭, Ŭ����
		 */
	}
	// ����� �Է�
	static int[] userInput()
	{
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		int input=0;
		
		while(true)
		{
			System.out.println("���ڸ� �Է��Ͻÿ�");
			input=scan.nextInt();
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(input<100||input>999)
			{
				System.out.println("���ڸ����� �Է��Ͻÿ�");
				continue;
			}
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� �Է� �Ұ�");
				continue;
			}
			break;
		}
		
		return user;
	}
	// ��
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
	// ��Ʈ
	static void hint(int[] user, int a, int b)
	{
		System.out.printf("Input Number : %d-%d-%d\nResult : %dS-%dB\n"
				,user[0],user[1],user[2],a,b);
	}
	// ����
	static boolean isEnd(int a)
	{
		boolean bCheck=false;
		if(a==3)
			bCheck=true;
		return bCheck;
	}
	// ����
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
				System.out.println("������ �ٽ� �ұ��?(Y/N)");
				String res=scan.next();
				char ch=res.charAt(0); //���� ������ 0��° char
				if(ch=='y')
				{
					System.out.println("�� ������ ���۵Ǿ����ϴ�");
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
		// ����
		process();
	}

}

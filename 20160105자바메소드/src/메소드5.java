/*
 * 	1~100���� ���� �߻�
 * 	������ ���ߴ� ���α׷� 
 */
import java.util.Scanner;
public class �޼ҵ�5 {
	static int getRand()
	{
		return (int)(Math.random()*100)+1;
	}
	
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		return scan.nextInt();
	}
	
	static boolean hint(int com, int user)
	{
		boolean bCheck=false;
		
		if(com>user)
			System.out.println("��");
		else if(com<user)
			System.out.println("�ٿ�");
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
				System.out.println("������ �ٽ��ұ��(Yes(1)/No(2)");
				Scanner scan=new Scanner(System.in);
				int regame=scan.nextInt();
				if(regame==1)
				{
					process();	//���ȣ�� - �ڱ��ڽ��� �ٽ� �θ�
				}
				else
				{
					System.out.println("Game Over");
					System.exit(0);	//���α׷� ���� ����
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

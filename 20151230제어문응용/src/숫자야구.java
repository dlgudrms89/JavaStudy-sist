/*
 * 	1) �ߺ����� ����(com) ==> int[] com 
 * 	2) ���� �Է�(user) ==> int[] user
 * 	3) ������ �Է°� �� ==> s,b
 * 	4) ��Ʈ ==> s, b
 * 	5) ���� ==> s==3�̸� ����
 */
import java.util.Scanner;
public class ���ھ߱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		int[] user=new int[3];
		int s,b;
		
		// �ߺ����� �����߻�
		int su=0;//��������
		boolean bDash=false;//�ߺ�Ȯ��
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
		
		Scanner scan=new Scanner(System.in);//user ���� �Է�
		while(true)
		{
			System.out.println("���ڸ� ���� �Է�");
			int input=scan.nextInt();
			if(input<100||input>999)
			{
				System.out.println("���ڸ� ������ �Է��Ͻÿ�");
				continue;	//for���̸� ����������, while���̸� ���ǽ����� ����.
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� ����� �� ����");
				continue;
			}
			
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0�� �Է��� �� ����");
				continue;
			}
			
			//S,BȮ��
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

/*
 * 	1~45���� 6���� �ߺ����� ���� �߻�
 * 	����ڰ� 6�� �Է� ==> ��
 * 	3-->4
 * 	4-->3
 * 	5-->2
 * 	6-->1
 */
import java.util.Scanner;
public class �ζ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];	// ������ �����ϴ� ����
		int[] user=new int[6];
		int su=0;	//����
		boolean bDash=false;	//�ߺ�����Ȯ��
		
		for(int i=0; i<6; i++)
		{
			bDash=true;
			while(bDash)	//false�� �ɶ����� ����(�ߺ��� ������ ��� ����)
			{
				su=(int)(Math.random()*45)+1;	//�����߻�
				bDash=false;
				for(int j=0; j<i; j++)	//�ߺ�üũ
				{
					if(arr[j]==su)
					{
						bDash=true;
						break;	//������ �ߺ��Ǹ� �ٽ� ���� su�� ������ ���Է�
					}
				}
			}
			arr[i]=su;	//������ �迭�� ����
		}
		System.out.println();
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<6; i++)
		{
			System.out.println("1~45 ������ ���ڸ� �Է��Ͻÿ�\n"+(i+1)+"��° ���� : ");
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
					System.out.println("�ߺ��� ���� �Է��� �� �����ϴ�.");
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
		
		System.out.print("�� :\t");
		for(int i=0; i<6; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.print("�� :\t");
		for(int i=0; i<6; i++)
		{
			System.out.print(user[i]+"\t");
		}
		System.out.println();
		switch(count)
		{
		case 6:
			System.out.println("1��!");
			break;
		case 5:
			System.out.println("2��");
			break;
		case 4:
			System.out.println("3��");
			break;
		case 3:
			System.out.println("4��");
			break;
		default:
			System.out.println("��");
		}

	}

}

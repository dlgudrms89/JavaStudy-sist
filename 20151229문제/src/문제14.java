/*
 * 	������
 * 		���׿�����(++,--,!)
 * 		���������(+,-,*,/,%)
 * 		��������(&&,||)
 * 		���迬����(==,!=,>,<,>=,<=,)
 * 		���Կ�����(=,+=,-=)
 * 	���
 * 		���ǹ�(if, if-else, if-else if-else)
 * 		���ù�(switch-case)
 * 		�ݺ���(for,while)
 * 		�ݺ����(break,continue(while������ ó������ ���ư�))
 */
//���ھ߱�����!!!
/*	���ڸ� ���� ���� �ڸ�+������ġ�� ��Ʈ����ũ, �ٸ��ڸ�+������ġ�� ��
 *  3 4 5
 *   => 1 2 3
 *   	��Ʈ����ũ:0-��:1
 *   => 4 5 6
 *   	��Ʈ����ũ:0-��:2
 *   => 3 5 4
 *   	��Ʈ����ũ:1-��:2
 *   => 3 4 5
 *   	��Ʈ����ũ:3-��0 => break
 */
/*
 * ���α׷� ����
 * 1.�����߻� => �Ŀ��� ������ ���� ����3��
 * 2.����ڰ� ���� 3�� �Է�
 * 3.�Է°�,��������
 * 4.��Ʈ����
 * 5.3SȮ�� => Ʋ���� 2������ ���ư�
 * 		=> ������ break
 */
import java.util.Scanner;
public class ����14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] com={7,5,8};
		int[] user=new int[3];
		
		while(true)
		{
			System.out.println("���� 3���� �Է��Ͻÿ�");
			int input=scan.nextInt();
			if(input<100||input>999)
			{
				System.out.println("�߸����Է��Դϴ�.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=(input%10);
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� ����� �� �����ϴ�.");
				continue;
			}
			//ó����
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
			
			System.out.println("===================="); //������ó�� ǥ��
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("��");
			}
			System.out.print(" B:");
			for(int i=0;i<b;i++)
			{
				System.out.print("��");
			}
			System.out.println();
			System.out.println("====================");
			
			if(s==3)
			{
				System.out.println("\"Game Over!!\"");
				// \" : ū����ǥ ǥ��
				System.out.println("c:\\javadev\\javaStudy");
				// \\ : �������� �ΰ��� ��� ���������� ǥ�õ�
				break;
			}
		}
	}

}

/*
 * 	��� : ���α׷��� �°� ��� �ϴ� ���α׷�
 * 	���ǹ�
 *		���� if 
 * 		1) ����
 * 			=> if(���ǹ�)
 * 				���� ====> ���ǹ��� true�� �������
 * 					===> ���ǹ��� false��  ����x
 * 			=> �������� ������ ���ÿ� ����
 * 				if(���ǹ�)
 * 				{
 * 					����1
 * 					����2
 * 				}
 * 				***** �ڹٿ��� ����� {}�� ���� ��쿡 �ٷ� �ؿ� �ִ� ���常 ����
 * 			=> ������ true, false�� �� �ٸ� ������ ����
 * 				if(���ǹ�)
 * 					����1
 * 				else
 * 					����2
 * 
 * 				
 */
import java.util.Scanner;
//Scanner : Ű���� �Է°��� �޴� ���
public class ���ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Math.random() -> 0.0~0.99
		int rand=(int)(Math.random()*100)+1;
		System.out.println("rand="+rand);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num=scan.nextInt();
		System.out.println("num="+num);
		
		int com=(int)(Math.random()*3); //0~2
		
		Scanner scan2=new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2) �Է� : ");
		int user=scan2.nextInt();
		if(user==0)
		{
			System.out.println("����� : ����");
		}
		else if(user==1)
		{
			System.out.println("����� : ����");
		}
		else if(user==2)
		{
			System.out.println("����� : ��");
		}
		else
		{
			System.out.println("�϶�´�� �ض�");
		}
		
		if(com==0)
		{
			System.out.println("��ǻ�� : ����");
		}
		else if(com==1)
		{
			System.out.println("��ǻ�� : ����");
		}
		else
		{
			System.out.println("��ǻ�� : ��");
		}
		
		if(user<0||user>2)
		{
			System.out.println("����� �й�");
		}
		else if(user>com)
		{
			System.out.println("����� �¸�");
		}
		else if(user<com)
		{
			System.out.println("����� �й�");
		}
		else if(user==com)
		{
			System.out.println("���");
		}
		
		/*
		 * 		��ǻ��-�����
		 * 		==> USER : -1,2
		 * 		==> COM : -2,1
		 * 		==> DRAW : 0
		 */
		
		int res=com-user;
		if(res==-1||res==2)
		{
			System.out.println("����ڰ� �̰��");
		}
		else if(res==-2||res==1)
		{
			System.out.println("��ǻ�Ͱ� �̰��");
		}
		else if(res==0)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("���ϳ�");
		}
	}

}

/*
 * 	�޼ҵ� : �Ѱ��� ����� �����ϴ� ��ɹ��� ����
 * 		  ======= (������ ����)
 * 		����)
 * 			�����(��������) �޼ҵ���(�Է°�.....)
 * 			{
 * 				ó��
 * 				������� �����ش�
 * 				return ����� (void�� ���� ������� ���� �޼ҵ��̹Ƿ� ���� ����)
 * 			}
 * 
 * 			ȣ�� ==> �޼ҵ���(�Է°�)
 * 			
 * 			����� 		�Է°�
 * 			============
 * 			O		X
 * 			O		X
 * 			X		O
 * 			X(void)	X()
 * 			
 * 			=> void main(String[] args)
 * 				�����(X) �Ű�����(O)
 * 				double random()
 * 				�����(O) �Ű�����(X)
 * 				int nextInt()
 * 				�����(O) �Ű�����(X)
 * 
 * 
 */
import java.util.Scanner;
public class �޼ҵ�1 {
	// �Ű�����(����� �Է°�), ������(ó�� �����)
	static int plus(int a, int b)
	{
		int c=a+b;
		return c;
	}
	static int minus(int a, int b)
	{
		int c=a-b;
		return c;
	}
	static int gop(int a, int b)
	{
		int c=a*b;
		return c;
	}
	static double div(int a, int b)
	{
		double d=a/(double)b;
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� ������ ����(����) �� �Է�
		 * = �����Է�
		 * int a=10;
		 * int a=scan.nextInt()
		 * int a=(int)(Math.random()*100)
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("1' �����Է� : ");
		int a=scan.nextInt();
		System.out.println("2' �����Է� : ");
		int b=scan.nextInt();

		// +
		int res=plus(a,b);
		System.out.println("���� : "+res);
		// -
		int res2=minus(a,b);
		System.out.println("���� : "+res2);
		// *
		int res3=gop(a,b);
		System.out.println("���� : "+res3);
		// /
		double res4=div(a,b);
		System.out.println("������ : "+res4);
	}

}

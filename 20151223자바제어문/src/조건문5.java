/*
 *	����if��
 *		����)
 *			if(���ǹ�)	���ǹ�(true/false)
 *				����1 ==> true�� �� ����
 *			else
 *				����2 ==> false�� �� ����
 *
 */
import java.util.Scanner;
public class ���ǹ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("1~100������ ���� �Է� : ");
		int num=scan.nextInt();
		if(num<1||num>100)
			System.out.println("�߸��� �Է�");
		else //�����Է��̸�
		{
			System.out.println("�����Է��Դϴ�");
			
			if(num%2==0)
				System.out.println(num+"��(��) ¦���Դϴ�");
			else
				System.out.println(num+"��(��) Ȧ���Դϴ�");
		}
		
			
	}

}

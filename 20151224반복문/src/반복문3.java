/*
 * 	UP-DOWN����
 */
import java.util.Scanner;
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int com=(int)(Math.random()*100)+1;//random : 0.0~0.99
		
		int count=0;//������� ���߳�
		for(;;)//���ѷ���
		{
			System.out.print("1~100���� ������ ������ �Է� : ");
			int user = scan.nextInt();
			if(user<1||user>100)
			{
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}			
			count++;
			// ��
			if(com>user)
			{
				System.out.println("��");
			}
			else if(com<user)
			{
				System.out.println("�ٿ�");
			}
			else
			{
				System.out.println("�ä�");
				System.out.println("���� : "+(100-(count*10)));
				break;
			}
		}
	}

}

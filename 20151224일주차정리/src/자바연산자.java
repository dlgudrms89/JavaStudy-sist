/*
 * 	���׿����� (����(++, --_, ����(!))
 * 	1) ����������
 * 		��ġ����
 * 		����) int a=10;
 * 			int b=++a;
 * 			=> a�� 1�� ����
 * 			=> ������ ���� b�� ����
 * 		��ġ����
 * 			int a=10;
 * 			int b=a++;
 * 			=> a���� b�� ���� ����
 * 			=> a���� 1�� ����
 * 	2) ����������(���ǹ� =>if)
 * 		boolean bCheck=false;
 * 		bCheck=!bCheck;
 * 		bCheck=true;
 * 
 * 	���׿�����
 * 	1)��������� (+,-,*,/,%)
 * 		=> ����ȯ(=>����� ū �����ͷ� ��ȯ)
 * 			int+long=long
 * 			int+int+double=double
 * 			*int ���ϴ� ����� => int
 * 		=> /
 * 			0���� ������ ����
 * 			����/����=����(�Ǽ���������, 5/2=2)
 * 		=> %
 * 			���� ���� �׻� �������� ��ȣ�� ����
 * 			-5%-2==>-1
 * 	2)���迬����(==,!=,<,>,<=,>=)
 * 		����� : true, false(boolean)
 * 		 		
 * 	3)��������(&&,||)
 * 		&& ==> ���ʿ� true => true
 * 		|| ==> ���ʿ��� true => true 
 * 	4)���Կ�����(=,+=,-=)
 * 		int a=10;
 * 		a+=1 ==> a=a+1
 * 		a-=1 ==> a=a-1
 */
//�⵵�� �Է� �޾Ƽ� �������� ���θ� Ȯ��
/*
 * 	4�⸶��
 * 	100�⸶�� ���⿡�� ����
 * 	400�⸶�� ����
 * 
 * 	if((year%4==0&&year%100!=0)||(year%400==0))
 */
/*
 * 	���
 * 		if(���ǹ�)
 * 		����)
 * 			if(���ǹ�)
 * 			{
 * 				//���ǹ��� true�� ��쿡 �����ϴ� ����
 * 			}
 * 			else if(���ǹ�)
 * 			{
 * 				//���ǹ��� true�� ��쿡 �����ϴ� ����
 * 			}
 * 			else
 * 			{
 * 				���ǹ��� false�� ��쿡 ó���ϴ� ����
 * 			}
 * 			*{}�� ���� ��쿡�� �ٷ� ���� �� ���常 �����Ѵ�.
 * 
 */
import java.util.Scanner;
public class �ڹٿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵ �Է� : ");
		int year=scan.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0))
			System.out.println(year+"�⵵�� �����Դϴ�.");
		else
			System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
		
	}

}

/*
 * 	���α׷� ���� ���
 * 		1) ������ ���� => ����
 * 		2) ������ ����ó�� => ������
 * 		3) ó���� ��� ��� 
 * 			=> System.out.println() : �ڵ����� �� �ٲ�
 * 			=> System.out.print() : �پ ����
 * 			=> System.out.printf() : ������ ������ �ִ� ���
 *
 * 	��Ʈ�̵�������(<<,>>)
 * 	10<<2 ==> ���������� ��ȯ �� 0�� 2�� �ٿ���(�������� 2ĭ �̵��϶�)
 * 	10 => 1010(������) => 101000 => 40(������)
 * 	
 * 	10>>2 => 1010 => 10 => 2
 */
public class ��Ʈ�̵������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-5d%-5d\n\n",10,20); //�������� 5ĭ ����
		
		int a=10;
		int b=2;
		int c=a<<b;
		int d=a>>b;
		System.out.println("10�� ������ = "+(Integer.toBinaryString(a))); //a�� ������
		System.out.println("c="+c);
		System.out.println("d="+d);
		
	}

}

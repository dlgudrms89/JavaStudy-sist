/*
 * 	���� : ������ ������ ��
 * 	= ���ϵ����� ����
 * 	= ������ ���� ���� (�迭, Ŭ����)
 * 
 * 1) ���� ����
 * 	     ������ ��(�ڷ���) ������=��
 * 	  =========
 * 		���� : byte(1), short(2), int(4), long(8) 
 * 		�Ǽ� : float(4), double(8)
 * 		���� : char(2)
 * 		�� : boolean(1)
 * 
 * 		���� ����� ���
 * 		= ���ĺ�, �ѱ۷� ����
 * 		= ���� ����� ���� (�տ� ��� ����)
 * 		= Ư������($,_)
 * 		= Ű����� ����� �� ����
 * 	2) �������� ũ��
 * 		byte < char < int < long < double
 * 				short			float
 * 	3) ����ȯ
 * 		int a=300;
 * 		int b=300;
 * 		byte c=(byte)(a+b) ==> 88 (�������� ���´�� ������ 88�� ����)
 */
public class �ڹٺ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=300;
		int b=300;
		byte c=(byte)(a+b);
		System.out.println("c="+c);
	}
}


public class �ڹ��ڷ��� {
	/*
	 * 	�ڷ���
	 * 	 ������
	 * 	  byte
	 * 	  short
	 * 	  int
	 * 	  long
	 * 	 �Ǽ���
	 * 	 ������
	 *	 ����
	 *
	 *	1) ���� �����͸� �����ϴ� �޸��� ��Ī : ����
	 *		���� : ���ϴ� ��(�������� �ʿ�ø��� �����ؼ� ����� ����)
	 *		��� : ������ �ʴ� ��(�������� �ʿ�)
	 *		
	 *		=> ���� ����
	 *			�޸�_ũ�⼱�� ������_���� = ��
	 *			ex) {
	 *				 int a = 10; //���� ���{}�󿡼� ���� �̸��� ������ ��� �� �� ����
	 *				 int a = 20;
	 *				}			
	 *				���� �Ŀ� ���߿� ���� ����
	 *				int a;
	 *				a =10;
	 *				int a, b, c;
	 *				int a=10, b=20, c=30;
	 *
	 *			=> ������ �����(�ĺ���)
	 *				1) ���ĺ��̳� �ѱ۷� ����(�� ���ĺ��� ��ҹ��ڸ� ����)
	 *				2) ���� ����� ����(�� �տ� ����� �� �� ����)
	 *				3) Ư�����ڸ� ��� �� �� �ִ�($,_)
	 *				4) Ű����� ����� �� ����(�ڹٿ��� �̹� ������� �ܾ� : int, long ��)
	 *				5) ������ ���̴� ������ ����
	 *
	 *				******����x �ڹٰ����ڵ鳢���� ���
	 *				1) Ŭ������ ù�ڴ� �빮�� (Main)
	 *				2) ����, �޼ҵ� ù�ڴ� �ҹ���
	 *				3) �ΰ� �̻��� �ܾ �̿��� �� �ι�° ������ �빮��(�밡����� ǥ����)
	 *					�� ���� �Ǵ� �����_(MainClass, Main_Class)
	 *
	 *			=> �ڷ����� ��ȯ
	 *				�ڷ����� ũ��
	 *				byte < short < int < long < float < double
	 *						char
	 *				=> �ڷ��� �۰�
	 *					(int)10.5 => (double(8)=>int(4))
	 *					���� ����ȯ(down-casting)
	 *				=> �ڷ��� ũ��
	 *					(double)10 => (int(4)=>double(8))
	 *					==> �ڵ�����ȯ (���� ����ø���)
	 *					'A'+1
	 *					1) 'A' => 65
	 *					2) 65+1 => 66
	 *				=> int a=10000000000(���)(���ڸ� ���� �ν��ϰ� �� ���� a�� �ν�, ������ ���� ���)
	 *				   => long a=10000000000L
	 *	
	 *				intũ�� ������ ������ ���� int�� ��
	 *				char+int = int
	 *				char+char = int
	 *				short+short = int
	 *				byte+int = int
	 *				byte+byte = int
	 *				int���� ū �Ŵ� ū �� ����
	 *				int+long = long
	 *				double+int = double
	 *				float+int = float
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue =127;
		short shortValue = 32767;
		int intValue = 2140000000;
		long longValue = 21400000000000L;
		float floatValue=10.5F;
		double doubleValue=10.5;
		char charValue='ȫ';
		boolean booleanValue=true;
		
		System.out.println("byteValue="+byteValue);
		System.out.println("shortValue="+shortValue);
		System.out.println("intValue="+intValue);
		System.out.println("longValue="+longValue);
		System.out.println("floatValue="+floatValue);
		System.out.println("doubleValue="+doubleValue);
		System.out.println("charValue="+charValue);
		System.out.println("booleanValue="+booleanValue);
		
	}

}

package �ڹٱ���;
/*
 * 	�ڷ��� : �޸� ũ�� ==> ������ ����ø��� �޸� ũ�⸦ ����
 *  (1byte, 2byte, 4byte, 8byte)
 *  
 *  1) ���� ����
 *  	byte (1byte) -128~127
 *  	short(2byte) -32768~32767
 *  	int (4byte) -21��4õ~21��4õ (default)
 *  	long (8byte) (�ڿ� L�� �ٿ��� int�� ����)
 *  2) �Ǽ� ����
 *  	float (4byte) 10.5F => �Ҽ��� 6�ڸ�
 *  	double (8byte) 10.5 (default) => �Ҽ��� 15�ڸ�
 *  3) ���� ���� (2byte) 'A', 'ȫ' => -���� ���� (0~65535)
 *  		�̱۹���Ʈ (1byte) : ASC
 *  		��Ƽ����Ʈ (2byte) : Unicode
 *  4) �� ����
 *  	boolean (1byte) => true/false
 *  5) ���� ==> Ŭ����, �迭
 */
public class �ڹ��ڷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d=123456.78F;
		int i=(int)((d-123456)*100);
		System.out.println(i); //double�̸� ����� 77, float�̸� 78
		
		System.out.println((int)'A'); //65 (����ȯ)
		System.out.println((char)67); //C
		System.out.println(10.5);
		System.out.println((int)10.5); //10
		
		/*
		 *  10 + 10.5 ==> 20.5 (ũ�Ⱑ Ŀ���� ������ �� ��ȯ��)
		 *  'A'+1==>66 (char=2byte, int=4byte => int�� �ٲ�)
		 *  
		 *  
		 *  byte<short<int<long<float<double
		 *       char
		 *  intũ�� ������ ������ ���� int�� ��
		 *  char+int = int
		 *  char+char = int
		 *  byte+byte = int
		 */
		
		byte b1=100;
		byte b2=30;
		//byte b3=b1+b2; //byte�� ���� �ʴ� ũ��� ����
		byte b3=(byte)(b1+b2);
		System.out.println(b3); //����� -126
		
		int i3=(int)(b1+b2);
		System.out.println(i3); //130
	}

}

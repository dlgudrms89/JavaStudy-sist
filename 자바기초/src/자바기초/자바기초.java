package �ڹٱ���;
/*
 * 	�ּ�
 * 	 1) �ڹ� ����
 * 		A.java =========> A.class =========> ����
 * 				javac(����� ��ȯ)		java(����������)
 * 									==========
 * 										JVM
 * 	 2) �ڹٿ��� ����ϴ� ������ ǥ����
 * 		1. ����
 * 			= 10���� : 100, 200
 * 			= 8���� : 0(����)
 * 			= 16���� : 0x(����)
 * 			100(4byte), 100L(8byte)
 * 		2. ����
 * 			= 'A', 'ȫ', '0'
 * 			  'A' : 65 (�ƽ�Ű�ڵ�) 'A'+1 ==> 66
 * 			  'a' : 97
 * 			  '0' : 48
 * 		3. ���ڿ�
 * 			= "ȫ�浿"
 * 		4. �Ǽ�
 * 			= 10.5 (8byte), 10.5F (4byte)
 * 		5. ��
 * 			= true, false
 */
public class �ڹٱ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���
		System.out.println(10);
		// 8����
		System.out.println(011);
		// 16����
		System.out.println(0x55);
		// ���� ǥ��
		System.out.println('A');
		System.out.println('ȫ');
		// ���ڿ�
		System.out.println("ȫ�浿");
		// �Ǽ�
		System.out.println(10.5);
		System.out.println(10.5F); //4byte
		// ��
		System.out.println(true);
		System.out.println(false);
		
		// ���ڿ� ���� (+) ���ϱ⿬����x
		System.out.println("7"+7+'7'+7+7);
		// ����� : 77777
		System.out.println(7+7+7+7+7); //35
		System.out.println(7+7+7+7+'7'); //287 (28 + '7')
	}

}

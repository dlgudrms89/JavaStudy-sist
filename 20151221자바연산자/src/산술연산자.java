/*
 * 	���������
 * 		(+, -, *, /, %)
 * 		+,-,* : �ڵ�����ȯ
 * 		10+20.5 => 30.5
 * 
 * 		'A'+5 = 70
 * 
 * 		int a=10.5+10.5; ==>double�� �ƴ϶� int�̹Ƿ� ����
 * 		int a=(10.5+10.5) //��:21
 * 		int a=(int)10.5+(int)10.5 //��:20
 * 
 * 		/(������)
 * 		1) 0���� ���� ��� ����
 * 			10/0 x
 * 		2) ����/����=����
 * 			10/3=>3
 * 		
 * 		%(������) : ������� ���� ��ȣ�� ���´�
 * 				5%2=1, -5%2=-1, -5%-2=-1, 5%-2=1
 * 		
 * 		41,42,43,64,67,72,74,92,93������ ����
 */
public class ��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=85;
		int eng=78;
		int math=80;
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
		System.out.printf("��� : %.2f\n",avg); //�Ҽ��� ���� 2�ڸ����� ����
		// ���� : %c(����), %d(����), %f(�Ǽ�), %s(���ڿ�), %5d(5ĭ�� ����), %-5d(��ĭ�� ���)
		System.out.println("5%2="+ 5%2);
		System.out.println("-5%2="+ -5%2);
		System.out.println("5%-2="+ 5%-2);
		System.out.println("-5%-2="+ -5%-2);
		
		System.out.println("5/2="+5/2);
		//System.out.println("10/0="+10/0)); ����
	}

}

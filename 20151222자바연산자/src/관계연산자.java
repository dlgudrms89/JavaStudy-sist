/*
 * 	���迬���� ==> �����(true/false) boolean
 * 		== ����
 * 		!= ���� �ʴ�
 * 		< �۴�
 * 		> ũ��
 * 		<= �۰ų� ����
 * 		>= ũ�ų� ����
 */
public class ���迬���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		boolean result=(a==++b);
		System.out.println("result="+result);
		
		result=(a==b++);
		System.out.println("result="+result);
		
		result=(a==b);
		System.out.println("result="+result);
		
		int a2=10;
		int b2=9;
		boolean result2=(a2!=b2);
		System.out.println("result2="+result2);
		b2++;
		result=(a2!=b2);
		System.out.println("result2="+result2);
		
		int c2=++b2;
		System.out.println(b2);
		result2=(a2!=c2);
		System.out.println("result2="+result2);
		
	}

}

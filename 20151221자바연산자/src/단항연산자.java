
public class ���׿����� {
/*
 * 	=> ���׿�����
 * 	++,-- ���� ������
 * 		++,--
 * 		a++(��ġ������), ++a(��ġ������)
 * 		��ġ������ : �ٸ� ���� �Ŀ� ����
 * 		��ġ������ : ���� �Ŀ� �ٸ� ����
 * 		int a=10
 * 		int b=a++; (a�� b�� �����ϰ� �����ض�)
 * 
 * 		int a=10;
 * 		int b=++a; (a�� ������Ű�� b�� �����϶�)
 * 
 * 	! ����������
 * 	(type) ����ȯ������
 * 	~����������
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		System.out.println("a="+a); //11
		System.out.println("b="+b); //11
		
		int aa=10;
		int bb=a++; //a�� b�� ����(b=10) �� a ����(a=11) 
		System.out.println("aa="+aa); //11
		System.out.println("bb="+bb); //10
		
		int a3=10;
		int b3=--a3;
		System.out.println("a3="+a3); //9
		System.out.println("b3="+b3); //9
		
		int a4=10;
		int b4=a4--;
		System.out.println("a4="+a4); //9
		System.out.println("b4="+b4); //10
	}

}

/*
 * 	���ڿ� ==> ���� �������� ��� ���
 * 			======
 * 			char[] ==> �����ؼ� ���� Ŭ���� : String
 * 	1) ��� ���
 * 		String ������ = "��";
 * 		====== ===
 * 		  Ŭ����         ��ü      ��ü������=> ��ü : ����� ���� ���������� ���� ������
 * 		
 * 		String ������ = new String("��");
 * 					====
 * 					���ο� �޸� ���� => ����
 * 				C������ malloc() => free()		
 * 		String str=new String("java")
 * 
 * 		�ڹ� �޸�
 * 		=======================
 * 		  method����
 * 		=======================
 * 		  stack => �޸𸮿� ���� ���� (��������, �Ű�����)
 * 		=======================
 * 		  head => �����ڰ� ���� (new�� �̿��ؼ� �Ҵ�)
 * 		=======================	
 * 
 * 		String str=new String("java");
 * 		==========  ==============
 * 			str			(java)
 * 			100			 100
 * 		==========  ==============
 * 
 * 		String : ��������, ���
 * 		1) equals : ���ڿ� ��
 * 		2) length : ������ ����
 * 		3) substring : ���� ����
 * 		4) split : ���� ����
 * 		5) startsWith, endsWith : �ڵ� �ϼ���
 * 		6) trim : �¿� ���� ����
 * 		7) indexOf, lastIndexOf : ���ϴ� ��ġ�� ���� ��ġ
 * 		8) replace : �ٸ� ���� ����
 * 		9) valueOf : ��� ���������� ���ڿ��� ����
 * 		10) charAt(0) : �ش� ���ڿ����� ���� �Ѱ��� ������ �� 
 * 
 */
public class ���ڿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2=new String("Hello"); //new�� ������ ���ο� �޸�
		if(str==str1)
		{
			System.out.println("str�� str1�� ����(�ּ�)");
		}
		if(str!=str2) //�ּҰ��� ������ ��
		{
			System.out.println("str�� str2�� �ٸ���");
		}
		
		if(str.equals(str2)) //���ڿ��� ������ ��
		{
			System.out.println("str==str2");
		}
		if(str.equalsIgnoreCase(str2))//ignore�� ��ҹ��� ������ ���� ����
		{
			System.out.println("str==str2 ��ҹ��� ����");
		}
	}

}

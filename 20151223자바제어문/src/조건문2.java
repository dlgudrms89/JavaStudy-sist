/*
 * 	����if
 * 		if(���ǹ�)
 * 			����1
 * 
 * 		if(���ǹ�)
 * 			����1
 * 			����2		//�ΰ� ���ÿ� �������� ����
 * 
 * 		if(���ǹ�)
 * 		{
 * 			����1
 * 			����2
 * 		}
 */
public class ���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		if(ch>='A'&&ch<='Z') //char�� �����ڰ� ���� �ڵ����� ���ڷ� �ٲ�
		{
			System.out.println(ch+"=�빮��");
		}
		if(ch>='a'&&ch<='z')
		{
			System.out.println(ch+"=�ҹ���");
		}
	}

}

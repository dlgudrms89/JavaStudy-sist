/*
 * 	3,5,7�� ���
 */
public class ���ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=21;
		if(num%3==0)
		{
			System.out.println(num+"��(��) 3�� ���");
		}
		if(num%5==0)
		{
			System.out.println(num+"��(��) 5�� ���");
		}
		if(num%7==0)
		{
			System.out.println(num+"��(��) 7�� ���");
		}
		System.out.println();
		
		int num2=10;
		if(num2%2!=0)
			System.out.println(num2+"��(��) ¦��");
			System.out.println("Program End");	//{}�� ������ if�� ���� ���常 if
		System.out.println();
		if(num2%2==0)
		{
			System.out.println(num2+"��(��) ¦��");
			System.out.println("Program End");
		}
	}

}

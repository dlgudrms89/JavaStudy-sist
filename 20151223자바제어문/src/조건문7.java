import java.util.Scanner;
public class ���ǹ�7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'+');
		System.out.println((int)'-');
		System.out.println((int)'*');
		System.out.println((int)'/');	//Scanner�� ���ڸ� �� ����
		
		char op='/';
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��° ���� �Է� : ");
		int num1=scan.nextInt();
		System.out.println("�ι�° ���� �Է� : ");
		int num2=scan.nextInt();
		int num3=0;
		if(op=='+')
		{
			num3=num1+num2;
			System.out.printf("%d%c%d=%d\n",num1,op,num2,num3);
		}
		else if(op=='-')
		{
			num3=num1-num2;
			System.out.printf("%d%c%d=%d\n",num1,op,num2,num3);
		}
		else if(op=='*')
		{
			num3=num1*num2;
			System.out.printf("%d%c%d=%d\n",num1,op,num2,num3);
		}
		else if(op=='/')
		{
			if(num2!=0)
			{
				num3=num1/num2;
				System.out.printf("%d%c%d=%d\n",num1,op,num2,num3);
			}
			else
				System.out.println("0���� ���� �� ����");
		}
		
	}

}

import java.util.Scanner;
public class ���ڿ�3 {
	static String calc(int a, char op, int b)
	{
		String str="";
		int res=0;
		switch(op)
		{
		case '+':
			res=a+b;
			str=String.valueOf(res); //valueOf : ���ڿ��� �ٲ�
			break;
		case '-':
			res=a-b;
			str=String.valueOf(res); //valueOf : ���ڿ��� �ٲ�
			break;
		case '*':
			res=a*b;
			str=String.valueOf(res); //valueOf : ���ڿ��� �ٲ�
			break;
		case '/':
			if(b==0)
			{
				str="0���� ���� �� �����ϴ�.";
			}
			else
			{
				res=a/b;
				str=String.valueOf(res); //valueOf : ���ڿ��� �ٲ�
			}
			break;
		default:
			str="�߸��� �������Դϴ�.";
		}
		return str;
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° �����Է� : ");
		int a=scan.nextInt();
		System.out.print("������ �Է�(+,-,*,/): ");
		String op=scan.next();
		System.out.print("�ι�° �����Է� : ");
		int b=scan.nextInt();
		String result=calc(a,op.charAt(0),b);
		System.out.println("���:"+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();		
	}

}

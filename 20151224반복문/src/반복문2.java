//������ �Է� �޾Ƽ� ������ ���
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("����(2~9)�Է�");
		int dan=scan.nextInt();
		for(int i=1; i<=9; i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		
		//for�� �̿��ؼ� 1~100������ ������ ������ ���� ���
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			System.out.println(i+":"+sum);
		}
		System.out.println("sum="+sum);

		//1~100 : ¦���� ��, Ȧ���� ��, ��ü�� ���� ���Ѵ�.
		int even=0, odd=0, sum100=0;
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			sum100+=i;
		}
		System.out.println("¦���� �� : "+even);
		System.out.println("Ȧ���� �� : "+odd);
		System.out.println("��ü�� �� : "+sum100);
		
		//1~100, 3,5,7�� ����� ��
		int num1=0, num2=0, num3=0;
		for(int i=1; i<=100; i++)
		{
			if(i%3==0)
				num1+=i;
			if(i%5==0)
				num2+=i;
			if(i%7==0)
				num3+=i;
		}
		System.out.println("3�� ����� �� : "+num1);
		System.out.println("5�� ����� �� : "+num2);
		System.out.println("7�� ����� �� : "+num3);
	}

}

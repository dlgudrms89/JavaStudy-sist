// while��
// ���� �Է¹޾Ƽ� => �ش� �� ������ ���
import java.util.Scanner;
public class �ݺ���2 {

	static void gugudan() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("while�� ó��");
		System.out.println("���� �Է��Ͻÿ�");
		int num = scan.nextInt();
		int i=1;
		while(i<=9)
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
		
		System.out.println("do~while�� ó��");
		i=1;
		do
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}while(i<=9);
	}

	public static void main(String[] args){
		gugudan();
		gugudan();
	}
}

import java.util.Scanner;
public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է�");
		int num = scan.nextInt();
		
		if(num%3==0)
			System.out.println("3�� ���");
		if(num%5==0)
			System.out.println("5�� ���");
		if(num%8==0)
			System.out.println("8�ǹ��");
		
	}

}

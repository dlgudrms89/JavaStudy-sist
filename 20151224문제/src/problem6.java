import java.util.Scanner;
public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� : ");
		int age = scan.nextInt();
		
		if(age>19)
			System.out.println("19�� �̻� : ��ȭ�� ������ �� �ֽ��ϴ�.");
		else if(age<15)
			System.out.println("15�� �̸� : ��ȭ�� ������ �� �����ϴ�.");
		else
			System.out.println("15~19�� : ������ ������ ��� ��ȭ�� ������ �� �ֽ��ϴ�.");
	}

}

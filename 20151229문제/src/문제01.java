import java.util.Scanner;
public class ����01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���� ���� �Է� : ");
		int kor=scan.nextInt();
		System.out.println("���� ���� �Է� : ");
		int eng=scan.nextInt();
		System.out.println("���� ���� �Է� : ");
		int math=scan.nextInt();
		
		System.out.println("����"+kor);
		System.out.println("����"+eng);
		System.out.println("����"+math);
		System.out.println("������:"+(kor+eng+math)+"�Դϴ�.");
		System.out.printf("�����: %.2f�Դϴ�.",(double)((kor+eng+math)/3));
	}

}

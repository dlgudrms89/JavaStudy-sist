import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���������Է� : ");
		int kor = scan.nextInt();
		System.out.println("���������Է� : ");
		int eng = scan.nextInt();
		System.out.println("���������Է� : ");
		int math = scan.nextInt();
		
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		int total = kor+eng+math;
		float avg = (kor+eng+math)/3.00F;
		System.out.printf("�հ� : %d ��� : %.2f",total,avg);
	}

}

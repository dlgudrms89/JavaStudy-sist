import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �ΰ� �Է� : ");
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		
		float plus = num1+num2;
		float minus = num1-num2;
		float x = num1*num2;
		
		System.out.println("�� : "+plus);
		System.out.println("�� : "+minus);
		System.out.println("�� : "+x);
	}

}

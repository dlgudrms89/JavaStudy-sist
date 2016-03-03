import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 두개 입력 : ");
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		
		float plus = num1+num2;
		float minus = num1-num2;
		float x = num1*num2;
		
		System.out.println("합 : "+plus);
		System.out.println("차 : "+minus);
		System.out.println("곱 : "+x);
	}

}

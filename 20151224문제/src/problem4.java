import java.util.Scanner;
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 : ");
		int num = scan.nextInt();
		
		int oddeven = num%2;
		if(oddeven==1)
			System.out.println("홀수");
		else
			System.out.println("짝수");
	}

}

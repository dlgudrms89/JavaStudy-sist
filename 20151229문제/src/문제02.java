import java.util.Scanner;
public class 문제02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력:");
		int num=scan.nextInt();
		if(num%2==0)
			System.out.println(num+"는(은) 짝수");
		else
			System.out.println(num+"는(은) 홀수");
	}

}

import java.util.Scanner;
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		int num = scan.nextInt();
		
		int oddeven = num%2;
		if(oddeven==1)
			System.out.println("Ȧ��");
		else
			System.out.println("¦��");
	}

}

import java.util.Scanner;
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("임의의 수 입력 : ");
		int num=scan.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++)
		{
			sum+=i;
		}
		System.out.println("1 부터"+num+"까지의 합 : "+sum );
	}

}

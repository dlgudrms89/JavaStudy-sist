import java.util.Scanner;
public class 문제08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("단입력:");
		int num=scan.nextInt();
		for(int i=1; i<=9; i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}

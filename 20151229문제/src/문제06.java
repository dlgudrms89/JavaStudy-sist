import java.util.Scanner;
public class ����06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���������Է�:");
		int kor=scan.nextInt();
		System.out.println("���������Է�:");
		int eng=scan.nextInt();
		int avg=(kor+eng)/2;
		char score='A';
		
		switch(avg/10)
		{
		case 10:
			score='A';
			break;
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
		
		System.out.println("����:"+kor+",����:"+eng);
		System.out.println("����:"+score);
	}

}

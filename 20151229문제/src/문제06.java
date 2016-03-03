import java.util.Scanner;
public class 문제06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수입력:");
		int kor=scan.nextInt();
		System.out.println("영어점수입력:");
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
		
		System.out.println("국어:"+kor+",영어:"+eng);
		System.out.println("학점:"+score);
	}

}

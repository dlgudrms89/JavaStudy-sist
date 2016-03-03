import java.util.Scanner;
public class 문제01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor=scan.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng=scan.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math=scan.nextInt();
		
		System.out.println("국어"+kor);
		System.out.println("영어"+eng);
		System.out.println("수학"+math);
		System.out.println("총점은:"+(kor+eng+math)+"입니다.");
		System.out.printf("평균은: %.2f입니다.",(double)((kor+eng+math)/3));
	}

}

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수입력 : ");
		int kor = scan.nextInt();
		System.out.println("영어점수입력 : ");
		int eng = scan.nextInt();
		System.out.println("수학점수입력 : ");
		int math = scan.nextInt();
		
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		int total = kor+eng+math;
		float avg = (kor+eng+math)/3.00F;
		System.out.printf("합계 : %d 평균 : %.2f",total,avg);
	}

}

import java.util.Scanner;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[][] score=new int[5][5];
		int total=0;
		int avg=0;
		for(int i=0; i<5; i++)
		{
			System.out.println(i+1+"번째 학생의 점수입력");
			for(int j=0; j<3; j++)
			{
				switch(j)
				{
				case 0:
					System.out.println("국어");
					break;
				case 1:
					System.out.println("영어");
					break;
				case 2:
					System.out.println("수학");
					break;
				}
				score[i][j]=scan.nextInt();
				score[i][3]+=score[i][j];
				score[i][4]=score[i][3]/3;
			}
			total=0;
			avg=0;
		}
		System.out.print("국어\t영어\t수학\t총점\t평균");
		System.out.println();
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

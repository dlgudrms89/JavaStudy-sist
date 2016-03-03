// 정수값 3개입력받아서 => 학점 계산
/*
 * 	정수값 3개를 받는 메소드
 * 	리턴형		매개변수
 * 	int[]	 X
 * 	학점계산 메소드
 * 	리턴형		매개변수
 * 	char	int[]
 * 	
 */
import java.util.Scanner;
public class 메소드4 {
	//입력
	static int[] input()
	{
		Scanner scan=new Scanner(System.in);
		int[] score=new int[3];
		System.out.print("국어점수 : ");
		score[0]=scan.nextInt();
		System.out.print("영어점수 : ");
		score[1]=scan.nextInt();
		System.out.print("수학점수 : ");
		score[2]=scan.nextInt();
		return score;
	}
	static int scoreTotal(int[] score)
	{
		int total=0;
		for(int i=0; i<score.length; i++)
		{
			total+=score[i];
		}
		return total;
	}
	static char hak(int total)
	{
		char hak='A';
		double avg=total/3.0;
		if(avg>90)
			hak='A';
		else if(avg>80)
			hak='B';
		else if(avg>70)
			hak='C';
		else if(avg>60)
			hak='D';
		else
			hak='F';
		return hak;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=input();
		System.out.println("학점 : "+hak(scoreTotal(score)));
	}

}

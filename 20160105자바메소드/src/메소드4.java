// ������ 3���Է¹޾Ƽ� => ���� ���
/*
 * 	������ 3���� �޴� �޼ҵ�
 * 	������		�Ű�����
 * 	int[]	 X
 * 	������� �޼ҵ�
 * 	������		�Ű�����
 * 	char	int[]
 * 	
 */
import java.util.Scanner;
public class �޼ҵ�4 {
	//�Է�
	static int[] input()
	{
		Scanner scan=new Scanner(System.in);
		int[] score=new int[3];
		System.out.print("�������� : ");
		score[0]=scan.nextInt();
		System.out.print("�������� : ");
		score[1]=scan.nextInt();
		System.out.print("�������� : ");
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
		System.out.println("���� : "+hak(scoreTotal(score)));
	}

}

import java.util.Scanner;
public class ����05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hak=new char[3];
		int[] rank=new int[3];
		
		for(int i=0; i<3; i++)	//�迭�� �Է�, ���� ��� ���
		{
			System.out.printf("%d��° �������� �Է� : ",i+1);
			kor[i]=scan.nextInt();
			System.out.printf("%d��° �������� �Է� : ",i+1);
			eng[i]=scan.nextInt();
			System.out.printf("%d��° �������� �Է� : ",i+1);
			math[i]=scan.nextInt();
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		
		char score='A';
		for(int i=0; i<3; i++)	//���� ������
		{
			switch((int)(avg[i])/10)
			{
			case 10:
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
			hak[i]=score;
		}
		
		for(int i=0; i<3; i++)	//��� ���ϴ� �˰���
		{
			rank[i]=1;
			for(int j=0; j<3; j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		
		System.out.printf("%10s%10s%10s%14s%20s%10s%10s\n",
				"����","����","����","����","���","����","���");//%s�� ���ڿ�
		for(int i=0; i<3; i++)
		{
			System.out.printf("%5d%5d%5d%7d%10.2f%5c%5d\n",
					kor[i],eng[i],math[i],total[i],avg[i],hak[i],rank[i]);
		}
	}
}
import java.util.Scanner;
public class ����12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("10���� �л� ���� �Է�");
		for(int i=0; i<10; i++)
		{
			System.out.println((i+1)+"���л� ���� : ");
			arr[i]=scan.nextInt();
		}
		
		int total=0;
		for(int i=0; i<10; i++)
		{
			total+=arr[i];
		}
		double avg=0.0;
		avg=total/10.0;
		
		for(int i=0; i<9; i++)
		{
			for(int j=i+1; j<10; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int max=0;
		int min=100;
		for(int i=0; i<10; i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("���� : "+total);
		System.out.printf("��� : %.2f\n",avg);
		System.out.println("�ִ����� : "+arr[arr.length-1]);
		System.out.println(max);
		System.out.println("�ּ����� : "+arr[0]);
		System.out.println(min);
	}

}

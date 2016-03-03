import java.util.Scanner;
public class 문제09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 세개를 입력");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int[] arr={num1,num2,num3};
		int max=0;
		
		for(int i=0; i<3; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println("최대값:"+max);
		System.out.println();
		
		//////////////////////////
		
		int[] val=new int[5];
		int MAX=0, min=100;
		for(int i=0; i<5; i++)
		{
			val[i]=(int)(Math.random()*100)+1;
			System.out.print(val[i]+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			if(MAX<val[i])
				MAX=val[i];
			if(min>val[i])
				min=val[i];
		}
		System.out.println("최대값:"+MAX);
		System.out.println("최소값:"+min);
	}
}

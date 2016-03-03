//정수를 입력 받아서 구구단 출력
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수(2~9)입력");
		int dan=scan.nextInt();
		for(int i=1; i<=9; i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		
		//for를 이용해서 1~100까지의 정수를 누적한 값을 출력
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			System.out.println(i+":"+sum);
		}
		System.out.println("sum="+sum);

		//1~100 : 짝수의 합, 홀수의 합, 전체의 합을 구한다.
		int even=0, odd=0, sum100=0;
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			sum100+=i;
		}
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);
		System.out.println("전체의 합 : "+sum100);
		
		//1~100, 3,5,7의 배수의 합
		int num1=0, num2=0, num3=0;
		for(int i=1; i<=100; i++)
		{
			if(i%3==0)
				num1+=i;
			if(i%5==0)
				num2+=i;
			if(i%7==0)
				num3+=i;
		}
		System.out.println("3의 배수의 합 : "+num1);
		System.out.println("5의 배수의 합 : "+num2);
		System.out.println("7의 배수의 합 : "+num3);
	}

}

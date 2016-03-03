
public class 문제03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0;
		int even=0;
		for(int i=0; i<=100; i++)
		{
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("홀수의 합은 : "+odd);
		System.out.println("짝수의 합은 : "+even);
	}

}

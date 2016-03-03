
public class 문제07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=50; i++)
		{			
			if(i%5==0)
			{
				sum+=i;
				System.out.print(i+" ");
			}			
		}
		System.out.println();
		System.out.println("5의 배수합:"+sum);
	}

}

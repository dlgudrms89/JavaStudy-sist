
public class ����10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int sum=0;
		do{
			if(num%3==0)
			{
				sum+=num;
				System.out.print(num+" ");
			}			
			num++;
		}while(num<=100);
		System.out.println();
		System.out.println("3�� �����:"+sum);
	}

}

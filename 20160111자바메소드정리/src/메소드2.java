
public class ¸Þ¼Òµå2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5];
		int count=0;
		for(int i=0; i<3; i++)
		{
			for(int j=2-i; j<3+i; j++)
			{
				count++;
				arr[i][j]=count;
			}
		}		
		for(int i=3; i<5; i++)
		{
			for(int j=1+i-3; j<4-i+3; j++)
			{
				count++;
				arr[i][j]=count;
			}
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(arr[i][j]==0)
					System.out.print("\t");
				else
					System.out.print(arr[i][j]+"\t");	
			}
			System.out.println();
		}
	}

}


public class 배열숙제ㄹ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ㄹ자로 채우기
		int[][] arr=new int[5][5];
		int k=0;
		int begin=1, end=5, sw=1;

		for(int i=1; i<=5; i++)
		{
			if(sw>0)
			{
				for(int j=begin; j<=end; j+=sw)
				{
					k++;
					arr[i-1][j-1]=k;
				}
				sw=-1;
			}
			else if(sw<0)
			{
				for(int j=begin; j>=end; j+=sw)
				{
					k++;
					arr[i-1][j-1]=k;
				}
				sw=1;
			}
			int temp=begin;
			begin=end;
			end=temp;
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(arr[i-1][j-1]+"\t");
			}
			System.out.println();
		}
	}

}

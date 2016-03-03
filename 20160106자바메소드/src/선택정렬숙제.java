
public class 선택정렬숙제 {
	static int[] getData()
	{
		int[] data=new int[5];
		for(int i=0; i<5; i++)
		{
			data[i]=(int)(Math.random()*100)+1;
		}
		return data;
	}
	static int[] sort(int[] data)
	{
		for(int i=0; i<data.length-1; i++)
		{
			for(int j=i+1; j<data.length; j++)
			{
				if(data[i]>data[j])
				{
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		return data;
	}
	static void process()
	{
		int[] arr=getData();
		System.out.println("정렬전:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		sort(arr);
		System.out.println("정렬후:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

/*
 * 	�����߻� ==>5
 * 		int[] getRand(int s)
 * 	����
 * 		int[] sort(int[])
 */
public class �޼ҵ�3 {
	static int[] getRand(int num)
	{
		int[] rand=new int[num];
		for(int i=0; i<num; i++)
		{
			rand[i]=(int)(Math.random()*100)+1;
		}
		return rand;
	}
	
	//����
	static int[] sort(char order,int[] rand)
	{
		for(int i=0; i<rand.length-1;i++)
		{
			for(int j=i+1; j<rand.length; j++)
			{
				if(order=='A')
				{
					if(rand[i]>rand[j])
					{
						int temp=rand[i];
						rand[i]=rand[j];
						rand[j]=temp;
					}
				}
				else
				{
					if(rand[i]<rand[j])
					{
						int temp=rand[i];
						rand[i]=rand[j];
						rand[j]=temp;
					}
				}
			}
		}
		return rand;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rand=getRand(10);
		System.out.print("���� �� : ");
		for(int i=0; i<rand.length; i++)
		{
			System.out.print(rand[i]+" ");
		}
		System.out.println();

		int[] rand2=sort('A',rand);
		System.out.print("�ø����� ���� �� : ");
		for(int i=0; i<rand.length; i++)
		{
			System.out.print(rand[i]+" ");
		}
		System.out.println();
		
		int[] rand3=sort('B',rand);
		System.out.print("�������� ���� �� : ");
		for(int i=0; i<rand.length; i++)
		{
			System.out.print(rand[i]+" ");
		}
	}

}

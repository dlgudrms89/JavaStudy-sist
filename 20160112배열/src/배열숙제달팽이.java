/*
 *  00 01 02 03 04 -1 n=5
 *  14 24 34 44 -2 n=4
 *  
 *  43 42 41 40 -3 n=4
 *  30 20 10 -4 n=3
 *  
 *  11 12 13 -1 n=3
 *  23 33 -2 n=2
 *  32 31 -3 n=2
 *  21 -4 n=1
 *  
 *  22 -1 n=1
 */
public class ¹è¿­¼÷Á¦´ÞÆØÀÌ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[10][10];
		int a=0, b=-1;
		int k=0,sw=1,n=5;
		
		for(int i=0; i<5; i++)
		{
			if(sw>0)
			{
				for(b+=1; b<n; b+=sw)
				{
					k++;
					arr[a][b]=k;
				}
				b--;
			}
			else if(sw<0)
			{				
				for(b-=1; b>=0; b+=sw)
				{
					k++;
					arr[a][b]=k;
				}
				b++;
			}
			
			n--;
			if(n==0)
				break;
			
			if(sw>0)
			{
				for(a+=1; a<=n; a+=sw)
				{
					k++;
					arr[a][b]=k;
				}
				a--;
			}
			else if(sw<0)
			{
				for(a-=1; a>0; a+=sw)
				{
					k++;
					arr[a][b]=k;
				}
				a++;
			}
			sw*=-1;
		}

		for(int i=0;i<10;i++)
		{
			for(int j=0; j<10; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

/*
 * 	�޼ҵ� �������
 * 		=> ����� (������)
 * 		=> �Է°� (�����) => �Ű�����(or �μ�)(����������.)
 * 			: �޼ҵ� �ȿ��� ����ϴ� ����
 * 			* ����� �Է°�
 * 			* �ٸ� �޼ҵ�� ����
 * 				====> ��ü���� ����ϴ� ����(�������)
 * 				����)
 * 					������� : ���α׷� ����ÿ� �������.
 * 					= instance����(��ü����)
 * 						������ ���� �ȴ�
 * 					= static����(��������)
 * 						���� ������ �Ѱ�
 * 					�������� : {}�� ������ �����
 * 					= {}�ȿ����� ���Ǵ� ����
 * 	=> ����)
 * 			=========
 * 			������   �Ű�����
 * 			=========
 * 			 O	  O
 * 			=========
 * 			 O	  X
 * 			=========
 * 			 X	  O	=>�������� ���� ��쿡�� void
 * 			=========
 * 			 X	  X
 * 
 * 			1) ������ O, �Ű����� O
 * 				String substring(int s, int e)
 * 			2) ������ O, �Ű����� X
 * 				double random()
 * 			3) ������ X, �Ű����� O
 * 				void print(String s)
 * 			4) ������ X, �Ű����� X
 * 				void actionPerformed()
 * 
 * 			=> ����)
 * 				����� => �������̽�, �߻�Ŭ����
 * 				������ 
 * 				String substring(int s, int e) �����
 * 				{
 * 					������;
 * 				}
 * 
 * 	=> StringŬ����
 * 		����
 * 		String  s =  ��
 * 		======	=����
 * 		����Ÿ��(���������)
 * 
 * 		���� ���� ���ο� �޸𸮿� ���� : new
 * 		String s1=new String("aaa");
 * 		String s2=new String("aaa");
 * 		String s3=new String("aaa");
 * 		String s4=new String("aaa");
 * 		String s5=new String("aaa");
 * 		String s6="aaa";	//������ �� �ٸ� �޸�����
 * 		String s7="aaa";	//�ؿ� �ΰ��� ���� �޸�
 * 
 * 	=> �ֿ���
 * 		1) substring
 * 		2) indexOf, lastIndexOf
 * 		3) startsWith, endWith
 * 		4) trim
 * 		5) length
 * 		6) split
 * 		7) valueOf
 * 		8) replace, replaceAll
 * 		9) charAt
 * 	==========================
 * 
 * 	������ �迭 : ������ �迭 �������� ��Ƽ� ����
 * 	����)
 * 		��������[��][��] �迭��;
 * 		�������� �迭��[][];
 * 		��������[] �迭��[];
 * 
 * 		��:�ټ�=>����for
 * 		��:������ ���� => ����for
 * 
 * 		��)
 * 		5���� �л�
 * 		 ����,����,����,����,���,����
 * 		[5][6]
 */
public class �޼ҵ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�޼ҵ�1 a=new �޼ҵ�1();
		System.out.println(a);//�ּҰ� ���
		System.out.println();
		
		int[][] arr=new int[5][5];
		int count=0;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				count++;
				arr[i][j]=count;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr2=new int[5][5];
		count=0;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5-i; j++)
			{
				count++;
				arr2[i][j]=count;
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr3=new int[5][5];
		count=0;
		for(int i=0; i<5; i++)
		{
			for(int j=4-i; j<=4; j++)
			{
				count++;
				arr3[i][j]=count;
			}
		}
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(arr3[i][j]==0)
					System.out.print("\t");
				else
					System.out.print(arr3[i][j]+"\t");			
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr4=new int[5][5];
		count=0;
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<=4; j++)
			{
				count++;
				arr4[i][j]=count;
			}
		}
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(arr4[i][j]==0)
					System.out.print("\t");
				else
					System.out.print(arr4[i][j]+"\t");	
			}
			System.out.println();
		}
		System.out.println();
	}

}

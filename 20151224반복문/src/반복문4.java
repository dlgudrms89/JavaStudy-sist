/*
 * 	for
 * 		����)
 * 				 1	 2	 4
 * 			for(�ʱ�ȭ;���ǽ�;������)
 * 			{
 * 				���๮��
 * 					==> 3
 * 				���๮��
 * 			}
 * 			1=>2=>3=>4=>2
 */
// 1-2+3-4+5-6+7-8+9-10
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				num-=i;
			else
				num+=i;
		}
		System.out.println(num);
		
		for(char A='A'; A<='Z'; A++)	//����,�Ǽ��ε� ��
		{
			System.out.println(A);
			System.out.print((char)(A+32));
			System.out.println();
		}
		
	}

}

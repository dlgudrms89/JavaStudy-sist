/*
 * 	for
 * 		형식)
 * 				 1	 2	 4
 * 			for(초기화;조건식;증가식)
 * 			{
 * 				실행문장
 * 					==> 3
 * 				실행문장
 * 			}
 * 			1=>2=>3=>4=>2
 */
// 1-2+3-4+5-6+7-8+9-10
public class 반복문4 {

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
		
		for(char A='A'; A<='Z'; A++)	//문자,실수로도 됨
		{
			System.out.println(A);
			System.out.print((char)(A+32));
			System.out.println();
		}
		
	}

}

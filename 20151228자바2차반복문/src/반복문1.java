/*
 * 	2차 for
 * 		형식)
 * 				 1	 2	 7
 * 			for(초기값;조건식;증가식)
 * 			{		 3	 4	 6
 * 				for(초기값;조건식;증가식)
 * 				{
 * 					실행문장; 5
 * 				}
 * 			}
 * 			1-2-3-4-5-6-4-5-6..4=>false
 * 			-1-2-3-4-5-6-...-1-2=>false 종료
 * 		**** 1차 for : 홀수
 * 			 2차 for : 실행문장
 * 
 * 		실행결과)
 * 		****
 * 		****
 * 		****
 * 		****
 * 
 * 		for(int i=1; i<=4; i++)
 * 		{
 * 			for(int j=1; j<=4; j++)
 * 			{
 * 				System.out.print("*");
 * 			}
 * 			System.out.println();
 * 		}
 * 		
 * 		*
 * 		**
 * 		***
 * 		**** (j<=i)
 * 
 * 		****
 * 		***
 * 		**
 * 		*	(j<=5-i)
 * 		
 * 			*
 * 		   **
 * 		  ***
 * 		 ****
 * 		 i	j	k
 * 		줄수  공백    별표
 * 		1	3	1
 * 		2	2	2
 * 		3	1	3
 * 		4	0	4
 * 		i+j=4 => j=4-1
 * 		i=k
 * 
 * 		****
 * 		 ***
 * 		  **
 * 		   *
 * 		i=j+1 => j=i-1
 * 		i+k=5 => k=5-i
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=5-i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

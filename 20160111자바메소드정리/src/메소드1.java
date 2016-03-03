/*
 * 	메소드 구성요소
 * 		=> 결과값 (리턴형)
 * 		=> 입력값 (사용자) => 매개변수(or 인수)(지역변수다.)
 * 			: 메소드 안에서 사용하는 변수
 * 			* 사용자 입력값
 * 			* 다른 메소드로 전송
 * 				====> 전체에서 사용하는 변수(멤버변수)
 * 				변수)
 * 					멤버변수 : 프로그램 종료시에 사라진다.
 * 					= instance변수(객체변수)
 * 						저장이 따로 된다
 * 					= static변수(공유변수)
 * 						저장 공간이 한개
 * 					지역변수 : {}이 끝나면 사라짐
 * 					= {}안에서만 사용되는 변수
 * 	=> 형식)
 * 			=========
 * 			리턴형   매개변수
 * 			=========
 * 			 O	  O
 * 			=========
 * 			 O	  X
 * 			=========
 * 			 X	  O	=>리턴형이 없는 경우에는 void
 * 			=========
 * 			 X	  X
 * 
 * 			1) 리턴형 O, 매개변수 O
 * 				String substring(int s, int e)
 * 			2) 리턴형 O, 매개변수 X
 * 				double random()
 * 			3) 리턴형 X, 매개변수 O
 * 				void print(String s)
 * 			4) 리턴형 X, 매개변수 X
 * 				void actionPerformed()
 * 
 * 			=> 형식)
 * 				선언부 => 인터페이스, 추상클래스
 * 				구현부 
 * 				String substring(int s, int e) 선언부
 * 				{
 * 					구현부;
 * 				}
 * 
 * 	=> String클래스
 * 		사용법
 * 		String  s =  값
 * 		======	=변수
 * 		데이타형(사용자정의)
 * 
 * 		같은 값을 새로운 메모리에 저장 : new
 * 		String s1=new String("aaa");
 * 		String s2=new String("aaa");
 * 		String s3=new String("aaa");
 * 		String s4=new String("aaa");
 * 		String s5=new String("aaa");
 * 		String s6="aaa";	//위에는 다 다른 메모리지만
 * 		String s7="aaa";	//밑에 두개는 같은 메모리
 * 
 * 	=> 주요기능
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
 * 	이차원 배열 : 일차원 배열 여러개를 모아서 관리
 * 	형식)
 * 		데이터형[행][열] 배열명;
 * 		데이터형 배열명[][];
 * 		데이터형[] 배열명[];
 * 
 * 		행:줄수=>일차for
 * 		열:데이터 갯수 => 이차for
 * 
 * 		예)
 * 		5명의 학생
 * 		 국어,영어,수학,총점,평균,학점
 * 		[5][6]
 */
public class 메소드1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드1 a=new 메소드1();
		System.out.println(a);//주소값 출력
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

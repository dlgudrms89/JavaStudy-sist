/*
 * 	자바=>반복문
 * 	for : 반복 횟수가 지정이 된 경우에 주로 사용
 * 	for(조건문)
 * 	{
 * 		실행문장 => 2
 * 	}
 * 	while : 반복 횟수가 지정이 없는 경우에 주로 사용
 * 	while(조건문) =>1
 * 	{
 * 		실행문장 =>2
 * 	}
 * 	=========================수행을 못할 수도 있다
 * 	do~while : 무조건 한번 이상을 수행할 때 사용
 * 	do{
 * 		실행문장==1
 * 	}while(조건문)==2
 * 	2=>true==>1
 * 
 * 	==> for문
 * 			 1	  2	  4
 * 	형식) for(초기값;조건식;증가식)
 * 		{
 * 			반복 실행문장 3
 * 		}
 * 		1=>2=>3=>4=>2=>3=>4=>...=>2번이false면 종료
 * 		
 * 		for(int i=1; i<=10; i++)
 * 		{
 * 			i=1 => i<=10 true ==> 문장수행(i++)
 * 			i=2 => i<=10 true ==> 문장수행(i++)
 * 			i=3 => i<=10 true ==> 문장수행(i++)
 * 			...
 * 			i=10 => i<=10 true ==> 문장수행(i++)
 * 			i=11 => i<=10 false!! 종료
 * 		}
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
		{
			System.out.println("i="+i);
		}
		
	}

}

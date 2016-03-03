/*
 * 	1~10 난수 발생 => 중복없는 난수 발생
 * 	1) 난수 발생
 * 	2) 난수가 중복이 있는지 확인
 * 	3) 중복(O) => 난수발생
 * 		중복(X) => 저장
 * 
 * 		=> 1) 10개변수 => 배열
 * 			2) 난수저장
 * 			3) 중복체크
 */
public class 중복없는난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];	// 난수를 저장하는 변수
		int su=0;	//난수
		boolean bDash=false;	//중복여부확인
		
		for(int i=0; i<10; i++)
		{
			bDash=true;
			while(bDash)	//false가 될때까지 돈다(중복이 있으면 계속 돈다)
			{
				su=(int)(Math.random()*10)+1;	//난수발생
				bDash=false;
				for(int j=0; j<i; j++)	//중복체크
				{
					if(arr[j]==su)
					{
						bDash=true;
						break;	//난수가 중복되면 다시 돌고 su에 난수를 재입력
					}
				}
			}
			arr[i]=su;	//난수를 배열에 저장
		}
		
		for(int i=0; i<10; i++)
		{
			System.out.print(arr[i]+" ");	//출력
		}
	}
}

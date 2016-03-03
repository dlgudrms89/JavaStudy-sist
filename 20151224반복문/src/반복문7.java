
public class 반복문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("break");
		for(int i=1; i<=10; i++)
		{
			if(i==5)break; //여기서 바로 빠져나가므로
			System.out.println("i="+i); //출력이 안되고 결과는 4까지만
		}
		System.out.println("continue");
		for(int i=1; i<=10; i++)
		{
			if(i==5||i==7)continue; //5와 7만 제외 시킨다
			System.out.println("i="+i);
		}
		System.out.println("continue를 이용 홀수출력");
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)continue;
			System.out.println("i="+i);
		}
	}

}

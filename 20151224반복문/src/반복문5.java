/*
 * 	난수발생==>O,X
 */
import java.util.Scanner;
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=10; i++)
		{
			int answer=(int)(Math.random()*2); //0,1의 난수 발생
			System.out.println("X(0),O(1)를 입력");
			int user=scan.nextInt();
			if(answer==0)
			{
				System.out.println("Answer : X");
			}
			if(answer==1)
			{
				System.out.println("Answer : O");
			}
			if(user==0)
			{
				System.out.println("User : X");
			}
			if(user==1)
			{
				System.out.println("User : O");
			}
			
			if(answer==user)
				count++;
		}
		System.out.println("채점결과 : "+(count*10)+"점");
	}

}

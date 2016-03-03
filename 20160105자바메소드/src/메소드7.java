import java.util.Scanner;
// 단을 입력받아서
// 구구단 출력
public class 메소드7 {
	static int danInput()
	{
		return (int)(Math.random()*8)+2; //2~9
	}
//	static int dan()
//	{
//		System.out.println("단을 입력하시오");
//		Scanner scan=new Scanner(System.in);
//		return scan.nextInt(); 
//	}
	static void gugudan(int dan)
	{	
		for(int i=1; i<=9; i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(danInput());
	}

}

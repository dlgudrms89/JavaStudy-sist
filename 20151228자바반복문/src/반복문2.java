// while문
// 단을 입력받아서 => 해당 단 구구단 출력
import java.util.Scanner;
public class 반복문2 {

	static void gugudan() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("while문 처리");
		System.out.println("단을 입력하시오");
		int num = scan.nextInt();
		int i=1;
		while(i<=9)
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
		
		System.out.println("do~while문 처리");
		i=1;
		do
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}while(i<=9);
	}

	public static void main(String[] args){
		gugudan();
		gugudan();
	}
}

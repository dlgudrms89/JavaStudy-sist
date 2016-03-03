import java.util.Scanner;
public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = scan.nextInt();
		
		if(age>19)
			System.out.println("19세 이상 : 영화를 관람할 수 있습니다.");
		else if(age<15)
			System.out.println("15세 미만 : 영화를 관람할 수 없습니다.");
		else
			System.out.println("15~19세 : 성인을 동반한 경우 영화를 관람할 수 있습니다.");
	}

}

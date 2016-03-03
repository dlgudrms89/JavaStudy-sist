/*
 * 	true
 * 	false
 */
public class 부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=false;
		bCheck =! bCheck; //bCheck = true
		System.out.println("bCheck="+bCheck);
		
		int a=10;
		int b=~a; //b=-11 ~은 음수양수를 바꿈
		System.out.println("b="+b);
	}

}

// charAt : 문자열에서 원하는 문자를 한개 받는다
/*
 * 	String str="abcdef";
 * 			    012345
 * 	char c=str.charAt(1);
 * 	c=? => c=b
 */
import java.util.Scanner;
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳을 입력하라 : ");
		String data=scan.next();
		int count=0;
		for(int i=0; i<data.length(); i++)
		{
			char c=data.charAt(i);
			if(c=='a'||c=='A')
			{
				count++;
			}
		}
		System.out.print("a(A)의 갯수 : ");
		System.out.println(count);
	}

}

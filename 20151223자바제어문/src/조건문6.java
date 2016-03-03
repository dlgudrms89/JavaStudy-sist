/*
 * 	다중 조건문
 * 	형식)
 * 		if(조건문)
 * 			문장1
 * 		else if(조건문)
 * 			문장2
 * 		else
 * 			문장3
 */
public class 조건문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=85;
		char ch='A';
		if(score>=90)
			ch='A';
		else if(score>=80)
			ch='B';
		else if(score>=70)
			ch='C';
		else if(score>=60)
			ch='D';
		else
			ch='F';
		System.out.println("학점 : "+ch);
	}

}

/*
 * 	���� ���ǹ�
 * 	����)
 * 		if(���ǹ�)
 * 			����1
 * 		else if(���ǹ�)
 * 			����2
 * 		else
 * 			����3
 */
public class ���ǹ�6 {

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
		System.out.println("���� : "+ch);
	}

}

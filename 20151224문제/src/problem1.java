
public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int myMoney = 278970;
		int num=myMoney/10000;
		int balance=myMoney%10000;
		System.out.println("10000���� -> "+num+"��");
		
		num=balance/5000;
		balance=balance%5000;
		System.out.println("5000���� -> "+num+"��");
		
		num=balance/1000;
		balance=balance%1000;
		System.out.println("1000���� -> "+num+"��");
		
		num=balance/500;
		balance=balance%500;
		System.out.println("500���� -> "+num+"��");
		
		num=balance/100;
		balance=balance%100;
		System.out.println("100���� -> "+num+"��");
		
		
		num=balance/50;
		balance=balance%50;
		System.out.println("50���� -> "+num+"��");
		
		num=balance/10;
		balance=balance%10;
		System.out.println("10���� -> "+num+"��");*/
		
		int won = 278970;
		int val1 = won/10000;
		int val2 = (won%10000)/5000;
		int val3 = (won%5000)/1000;
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
	}

}

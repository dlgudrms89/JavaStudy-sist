import java.util.Scanner;
// ���� �Է¹޾Ƽ�
// ������ ���
public class �޼ҵ�7 {
	static int danInput()
	{
		return (int)(Math.random()*8)+2; //2~9
	}
//	static int dan()
//	{
//		System.out.println("���� �Է��Ͻÿ�");
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

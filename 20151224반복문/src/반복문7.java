
public class �ݺ���7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("break");
		for(int i=1; i<=10; i++)
		{
			if(i==5)break; //���⼭ �ٷ� ���������Ƿ�
			System.out.println("i="+i); //����� �ȵǰ� ����� 4������
		}
		System.out.println("continue");
		for(int i=1; i<=10; i++)
		{
			if(i==5||i==7)continue; //5�� 7�� ���� ��Ų��
			System.out.println("i="+i);
		}
		System.out.println("continue�� �̿� Ȧ�����");
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)continue;
			System.out.println("i="+i);
		}
	}

}

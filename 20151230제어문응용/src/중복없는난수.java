/*
 * 	1~10 ���� �߻� => �ߺ����� ���� �߻�
 * 	1) ���� �߻�
 * 	2) ������ �ߺ��� �ִ��� Ȯ��
 * 	3) �ߺ�(O) => �����߻�
 * 		�ߺ�(X) => ����
 * 
 * 		=> 1) 10������ => �迭
 * 			2) ��������
 * 			3) �ߺ�üũ
 */
public class �ߺ����³��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];	// ������ �����ϴ� ����
		int su=0;	//����
		boolean bDash=false;	//�ߺ�����Ȯ��
		
		for(int i=0; i<10; i++)
		{
			bDash=true;
			while(bDash)	//false�� �ɶ����� ����(�ߺ��� ������ ��� ����)
			{
				su=(int)(Math.random()*10)+1;	//�����߻�
				bDash=false;
				for(int j=0; j<i; j++)	//�ߺ�üũ
				{
					if(arr[j]==su)
					{
						bDash=true;
						break;	//������ �ߺ��Ǹ� �ٽ� ���� su�� ������ ���Է�
					}
				}
			}
			arr[i]=su;	//������ �迭�� ����
		}
		
		for(int i=0; i<10; i++)
		{
			System.out.print(arr[i]+" ");	//���
		}
	}
}

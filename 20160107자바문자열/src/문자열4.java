// substring => ���ڸ� �и�
/*
 * 	substring(int startIndex)	//�� �ܾ��
 * 	substring(3)	//3��° ���� �ܾ��
 * 	substring(int startIndex, endIndex)
 * 	substring(3, 7) => endIndex-1 => 3������ 6������ ������
 */
import java.io.*;
public class ���ڿ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="0123456789";
		String res1=str.substring(3);
		System.out.println(res1); //3456789
		String res2=str.substring(3, 7);
		System.out.println(res2); //3456
		System.out.println();
		
		File dir=new File("C:\\JavaDev\\JavaStudy\\20160106�ڹٸ޼ҵ�\\src");
		File[] files=dir.listFiles();	//������ ��� ���ϸ��� �о��
		for(int i=0; i<files.length; i++)
		{
			//System.out.println(files[i].getName()); //getName() : ������ �̸��� ������ �� 
			String name=files[i].getName();
			String ext=name.substring(name.lastIndexOf('.')+1); //.�ڿ� Ȯ���ڸ�(java)�� ������
			if(ext.equals("java"))
			{
				System.out.println(name);
			}
		}
	}

}

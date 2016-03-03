// substring => 문자를 분리
/*
 * 	substring(int startIndex)	//싹 긁어옴
 * 	substring(3)	//3번째 부터 긁어옴
 * 	substring(int startIndex, endIndex)
 * 	substring(3, 7) => endIndex-1 => 3번부터 6번까지 가져옴
 */
import java.io.*;
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="0123456789";
		String res1=str.substring(3);
		System.out.println(res1); //3456789
		String res2=str.substring(3, 7);
		System.out.println(res2); //3456
		System.out.println();
		
		File dir=new File("C:\\JavaDev\\JavaStudy\\20160106자바메소드\\src");
		File[] files=dir.listFiles();	//폴더와 모든 파일명을 읽어옴
		for(int i=0; i<files.length; i++)
		{
			//System.out.println(files[i].getName()); //getName() : 파일의 이름을 가져올 때 
			String name=files[i].getName();
			String ext=name.substring(name.lastIndexOf('.')+1); //.뒤에 확장자명(java)만 가져옴
			if(ext.equals("java"))
			{
				System.out.println(name);
			}
		}
	}

}

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class ��Ÿ���ڿ� {

	public static void main(String[] args)
	throws Exception
	{
		// TODO Auto-generated method stub
		// �� ������ �ҽ� ��������
		Document doc=Jsoup.connect("http://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
		//System.out.println(doc);
		
		Elements data=doc.select("td.title div.tit3"); //.title => css���� �±� �������°Ͱ� ����
		for(int i=0; i<data.size(); i++)
		{
			System.out.println(data.get(i).text()); //data���� �ؽ�Ʈ�� ������ �´�
		}
	}

}

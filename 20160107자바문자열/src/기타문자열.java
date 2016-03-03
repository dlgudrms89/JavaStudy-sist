import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 기타문자열 {

	public static void main(String[] args)
	throws Exception
	{
		// TODO Auto-generated method stub
		// 웹 페이지 소스 가져오기
		Document doc=Jsoup.connect("http://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
		//System.out.println(doc);
		
		Elements data=doc.select("td.title div.tit3"); //.title => css에서 태그 가져오는것과 같음
		for(int i=0; i<data.size(); i++)
		{
			System.out.println(data.get(i).text()); //data에서 텍스트만 가지고 온다
		}
	}

}

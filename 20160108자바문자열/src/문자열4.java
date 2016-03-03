/*
 * 	replace, replaceAll => &lt;< &gt;> (웹에서 퍼올때 저렇게 들어옴)
 */
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="&lt;html&gt;";
		data=data.replaceAll("&lt;","<");
		data=data.replaceAll("&gt;",">");
		System.out.println(data);
		System.out.println();
		data="Hello\tHello\tHello\t";
		System.out.println(data);
		System.out.println();
		System.out.println(data.replace('\t', '\n'));
	}

}

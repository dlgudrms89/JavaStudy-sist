// indexof, lastIndexOf
public class 문자열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello java";
		int i=str.indexOf('a'); //7번 'a'
		int l=str.lastIndexOf('a'); //뒤에서 부터 찾음=> 9번'a'
		System.out.println("indexOf() : "+i);
		System.out.println("lastIndexOf() : "+l);
	}

}

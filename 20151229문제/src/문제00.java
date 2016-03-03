/*  숙제
 *  2*1=2 3*1=3 4*1=4
 *  5*1=5 6*1=6 7*1=7
 *  8*1=8 9*1=9	=>6줄 완성
 */
public class 문제00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2; i<9; i+=3)
		{
			for(int k=1; k<=9; k++)
			{
				for(int j=i; j<=i+2&&j!=10; j++)
				{
					System.out.print(j+"*"+k+"="+j*k+"\t");
				}
				System.out.println();
			}
		}
	}

}

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 * 	정렬
 * 	1) 선택 정렬
 * 		30 20 40 10 50
 * 		== ==
 * 		==	  ==
 * 		==		 ==
 * 		==			==
 * 	2) 버블 정렬
 * 		30 20 40 10 50
 * 		== ==
 * 		20 30
 * 		   == ==
 * 		   30 40
 * 			  == ==
 * 			  10 40
 * 				 == ==
 * 				 40 50
 * 		20 30 10 40 50
 * 		== ==
 * 		   == ==
 * 		   10 30
 * 			  == ==
 * 		20 10 30 40 50
 * 		== ==
 * 		10 20
 * 		   == ==
 *		10 20 30 40 50
 * 		== ==
 * 		총 4바퀴 돈다
 */
public class 메소드정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0; i<5; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬전: ");
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//버블정렬
		System.out.println("정렬후:");
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}
		//Arrays.sort(arr); //정렬하는 함수
	}

}


public class RaggedArray {
	public static void main(String[] args) {
		//1st way
//		int[][]array; //선언(Declaration)
//		array=new int[3][]; //생성
//		array[0]=new int[3];
//		array[1]=new int[2];
//		array[2]=new int[1];
//		array[0][0]=(int)(Math.random()*10+1); //할당(assignment)
//		array[0][1]=(int)(Math.random()*10+1);
//		array[0][2]=(int)(Math.random()*10+1);
//		array[1][0]=(int)(Math.random()*10+1);
//		array[1][1]=(int)(Math.random()*10+1);
//		array[2][0]=(int)(Math.random()*10+1);
		
		//2nd way (각 층의 열 갯수는 다를 수 있다)
//		int[][]array;
//		array=new int[3][];
//		array[0]=new int[] {3,4,5,6,7,8};
//		array[1]=new int[] {9,10};
//		array[2]=new int[] {11,12,13};
		
		//3rd way (한 번에 생성과 할당)  
		int[][]array={{3,4,5,6,7,8}, {9,10}, {11,12,13}};
		for(int i=0; i<array.length; i++) {
			System.out.println("array"+i+"층");
			for(int j=0; j<array[i].length; j++) {
				System.out.println("array["+i+"]["+j+"]="+array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

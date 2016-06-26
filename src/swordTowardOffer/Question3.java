package swordTowardOffer;
/*
 * 题目描述：一个二维数组，每一行从左到右递增，每一列从上到下递增．输
 * 入一个二维数组和一个整数，判断数组中是否含有整数。
 */
public class Question3 {
	public static boolean find (int[][] matrix,int number){
		boolean found =false;
		int rows=matrix.length;
		int columns = matrix[0].length;
		if(matrix!=null&&rows>0&&columns>0){
			int row = 0;
			int column = columns -1;
			while(row<rows&&column>=0){
				if(matrix[row][column] == number){
					found =true;
					break;
				}else if(matrix[row][column] >number){
					column --;
				}else{
					row++;
				}
			}
		}
		return found;
		
	}
	public static void main(String[] args) {
		int[][] testarray=new int[4][4];
		testarray[0][0]=1;
		testarray[0][1]=2;
		testarray[0][2]=8;
		testarray[0][3]=9;
		testarray[1][0]=2;
		testarray[1][1]=4;
		testarray[1][2]=9;
		testarray[1][3]=12;
		testarray[2][0]=4;
		testarray[2][1]=7;
		testarray[2][2]=10;
		testarray[2][3]=13;
		testarray[3][0]=6;
		testarray[3][1]=8;
		testarray[3][2]=11;
		testarray[3][3]=15;
		System.out.println(find(testarray,18));
	}
}

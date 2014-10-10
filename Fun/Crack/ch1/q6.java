package ch1;

public class q6 {
	
	public static void main(String[] argv){
		//rotate 90degree
		int [][] matrix={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		matrix=rotate (matrix);
	}

	private static int[][] rotate(int[][] matrix) {
		
			for(int j=0;j<matrix[0].length;j++){
				for(int i=matrix.length-1;i>=0;i--){
				    System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		return null;
	}

}

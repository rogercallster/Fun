package epic;

public class NxNMatix {
	public static void main(String [] st){
		char [][] matrix=new char[5][5];
		int element=0+'a';
		for(int i=0;i<matrix.length;i++){
			for(int j=0; j<matrix[0].length;j++){
				matrix[i][j]=(char)element;
				element++;
			}
		}
        int j=0;
		for(int layer=0;layer<matrix.length/2;layer++){
			j=layer;
			while(j<matrix.length-layer-1){
				System.out.print(matrix[layer][j]+" ");
				j++;
			}
			j=layer;
			while(j<matrix.length-layer){
				System.out.print(matrix[j][matrix.length-layer-1]+" ");
				j++;
			}
			
			j=matrix.length-layer-2;
			while(j>layer){
				System.out.print(matrix[matrix.length-layer-1][j]+" ");
				j--;
			}
			j=matrix.length-layer-1;
			while(j>0){
				System.out.print(matrix[j][layer]+" ");
				j--;
			}
		
		}
	}

}

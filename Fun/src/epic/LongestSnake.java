package epic;

public class LongestSnake {
    public static void main(String[] str){
    	
    	
    }
    public static String longestSnake(int[][] array){
    	int[][] backTrack=new int[array.length+1][array[0].length+1];
    	for(int i=0;i<array.length+1;i++)backTrack[i][0]=0;
    	for(int i=0;i<array[0].length+1;i++)backTrack[0][i]=0;
    	
    	for(int i=1;i<array.length;i++){
    		for(int j=1;j<array[0].length;j++){
    			if(array[i][j]-array[i-1][j]==1 || array[i][j]-array[i-1][j]==-1 ||
    					array[i][j]-array[i][j-1]==1 || array[i][j]-array[i][j-1]==-1 ){
    				
    				backTrack[i][j]=backTrack[i-1][j]>backTrack[i][j-1]?backTrack[i-1][j]:backTrack[i][j-1];
    				backTrack[i][j]+=1;
    			}
    			else backTrack[i][j]=0;
    		}
    	}
    	
    	return "";
    }
}

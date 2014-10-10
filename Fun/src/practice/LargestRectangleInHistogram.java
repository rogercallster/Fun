package practice;

public class LargestRectangleInHistogram {

	public static void main(String[] str){
		int[] i={3,4,2,4,4,4,4,4,2,3,2,4,2};
		maxArea(i);
	}
    static void maxArea(int[] heights){
         int lmax=heights[0],x=0,y=0;

         for(int i=0;i<heights.length;i++){
             x=i;y=i;
             while(heights[x]>=heights[i]){
            	 x--;
            	 if(x<0){
            		 x=0;
            		 break;
            	 }
             }
             while(heights[y]>=heights[i]){
            	 y++;
            	 if(y>=heights.length){
   
            		 break;
            	 }
             }
             if(lmax < ((y-x)*heights[i]))lmax=((y-x)*heights[i]);
           }
         System.out.println(lmax+" x="+x+" y= "+y);

    }
}

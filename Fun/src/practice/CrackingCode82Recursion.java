package practice;

public class CrackingCode82Recursion {
private static final int MaxX = 4;
private static final int MaxY = 4;
static int count=0;

	/*
 * 8.2 Imagine a robot sitting on the upper left hand corner of an NxN grid. The
 *  robot can only move in two directions: right and down. How many possible paths
 *   are there for the robot?
FOLLOW UP
Imagine certain squares are “off limits”, such that the robot can not step on them
. Design an algorithm to get all possible paths for the robot.
 * */
	public static void main(String[] args) {

		findCombination( 0, 0,MaxX+MaxY-2);
       //System.out.println( '0'+0);
	}
    
	private static void findCombination(int i, int j,int steps){
		if(steps==1){
			count++;
			
			return;
		}
		else{
			if(j+1<MaxY)
			 findCombination(i, j+1, steps-1);
			if(i+1<MaxX)
				findCombination(i+1, j, steps-1);
		}
		
		
		
	}
	// findCombinationWithOutRecursion()
	
}

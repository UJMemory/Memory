package uj.memory.core.game.utils;

public class MathUtils {
	
	public static float getMaxBoardSqareSize(float tileCount, float width, float height){
		float maxSize = (float) Math.sqrt((width*height)/tileCount);
		
		float maxPosW = (float) Math.floor(width/maxSize);
		float maxPosH = (float) Math.floor(height/maxSize);
		
		float total = maxPosH*maxPosW;
		
		while(total < tileCount){
			maxSize--;
			maxPosW = (float) Math.floor(width/maxSize);
			maxPosH = (float) Math.floor(height/maxSize);
			total = maxPosH*maxPosW;
		}
		
		return maxSize;
	}

}

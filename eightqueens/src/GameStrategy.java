public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		

	return cellId%8;;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		
		for(int i=0;i<=7;i++)
			
		if(placedQueens[i][col]==true)
			isValid=false;
		for(int j=0;j<=7;j++)
			if(placedQueens[row][j]==true)
				isValid=false;
	
		for(int i=0,j=0;i<=7&&j<=7;i++,j++)
//			
		{if(Math.abs(i-j)==Math.abs(row-col) || (i+j)==(row+col) )
			{
			if(placedQueens[i][j]==true )
				isValid=false;
			}
		}
		if(isValid==true)
		{
				placedQueens[row][col]=true;
		}
		return isValid;
	}
}
















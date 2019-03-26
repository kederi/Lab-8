package lab8;

public enum GamePiece 
{
	RED_RACER, BLUE_RACER, MAGENTA_RACER, RED_THIMBLE, BLUE_BOOT, GREEN_BOOT, YELLOW_BOOT;
	
	private GamePieceAppearance appearance; 
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}
	public Color getColor()
	{
		appearance.getColor();
	}
	public Shape getShape()
	{
		appearance.getShape();
	}
	public GamePiece movesFirst(GamePiece a, GamePiece b)
	{
			if (a.priority < b.priority)
			{
				return a;
			}
			else if(a.priority > b.priority)
			{
				return b;
			}
			//else
			//	throw new NumberFormatException("Priority can't be equal");
		
	}
	public String toString()
	{
		
	}
	
}

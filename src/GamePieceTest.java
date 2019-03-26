

import org.junit.Assert;

import org.junit.Test;

public class GamePieceTest {

	@Test
	public void test() 
	{
		GamePiece test = GamePiece.BLUE_BOOT;
		Assert.assertEquals(Color.BLUE, test.getColor());
		Assert.assertEquals(Shape.BOOT, test.getShape());
		
		
	}
	@Test
	public void movesFirstTest()
	{
		GamePiece test1 = GamePiece.RED_RACER;
		GamePiece test2 = GamePiece.MAGENTA_RACER;
		
		Assert.assertEquals(test1, GamePiece.movesFirst(test1, test2));
		
		GamePiece test3 = GamePiece.YELLOW_BOOT;
		GamePiece test4 = GamePiece.MAGENTA_RACER;
		
		Assert.assertEquals(test4, GamePiece.movesFirst(test3, test4));
		
	}
	
	@Test
	public void toStringTest()
	{
		GamePiece test = GamePiece.RED_RACER;
		
		Assert.assertEquals("RED_RACER: a RED racecar with priority 0", test.toString());
	}

}



import org.junit.Assert;

import org.junit.Test;

public class GamePieceAppearanceTest {

	@Test
	public void test()
	{
		GamePieceAppearance test1 = new GamePieceAppearance(Color.RED, Shape.BOOT);
		GamePieceAppearance test2 = new GamePieceAppearance(Color.BLUE, Shape.THIMBLE);
		
		Assert.assertEquals(Color.RED, test1.getColor());
		Assert.assertEquals(Color.BLUE, test2.getColor());
		
		Assert.assertEquals(Shape.BOOT, test1.getShape());
		Assert.assertEquals(Shape.THIMBLE, test2.getShape());
	}

}

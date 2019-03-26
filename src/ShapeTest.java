

import org.junit.Assert;

import org.junit.Test;

public class ShapeTest {

	@Test
	public void testShape()
	{
		Assert.assertEquals("Shape enum values incorrect", Shape.THIMBLE, Shape.valueOf("THIMBLE"));
		Assert.assertEquals("Shape enum values incorrect", Shape.BOOT, Shape.valueOf("BOOT"));
		Assert.assertEquals("Shape enum values incorrect", Shape.RACECAR, Shape.valueOf("RACECAR"));
		
		
		
		
	}
	@Test
	public void toStringTest()
	{
		Assert.assertEquals("thimble", Shape.THIMBLE.toString());
		Assert.assertEquals("boot", Shape.BOOT.toString());
		Assert.assertEquals("racecar", Shape.RACECAR.toString());
	}

}



import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;


public class BoardGameTest {

	public BoardGame test = new BoardGame();
	@Test
	public void testAddPlayer() 
	{
		String testName = "Kobi";
		GamePiece testPiece = GamePiece.BLUE_BOOT;
		Location testLoc = Location.KITCHEN;
		
		Assert.assertEquals(true, test.addPlayer(testName, testPiece, testLoc));
		Assert.assertEquals(false, test.addPlayer("Goob", GamePiece.BLUE_BOOT, Location.CONSERVATORY));
		
		
	}
	@Test 
	public void getPieceTest()
	{
		test.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		Assert.assertEquals(GamePiece.YELLOW_BOOT, test.getPlayerGamePiece("Ron"));
		
	}
	
	@Test
	public void getPlayerPieceTest()
	{
		test.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		Assert.assertEquals("Ron", test.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
		Assert.assertEquals(null, test.getPlayerWithGamePiece(GamePiece.RED_RACER));
		
	}
	@Test
	public void movePlayerTest()
	{
		test.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		test.movePlayer("Ron", Location.KITCHEN);
		Assert.assertEquals(Location.KITCHEN, test.getPlayersLocation("Ron"));
	}
	@Test
	public void moveTwoPlayerTest()
	{
		test.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		test.addPlayer("Jeremy", GamePiece.RED_RACER, Location.KITCHEN);
		
		String [] players = {"Jeremy", "Ron"};
		Location [] loc = {Location.KITCHEN, Location.BILLIARD_ROOM};
		String [] res = test.moveTwoPlayers(players, loc);
		Assert.assertEquals(res[0], "Jeremy");
		
		
		String [] players2 = {"Ron", "Jeremy"};
		Location [] loc2 = {Location.KITCHEN, Location.BILLIARD_ROOM};
		String [] res2 = test.moveTwoPlayers(players2, loc2);
		Assert.assertEquals(res2[0], "Jeremy");
		
		
	}
	
	@Test
	public void testGetPlayersAtLoc()
	{
		test.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		test.addPlayer("Jeremy", GamePiece.RED_RACER, Location.KITCHEN);
		ArrayList<String> res = new ArrayList<String>();
		res.add("Ron");
		
		Assert.assertEquals(res, test.getPlayersAtLocation(Location.BILLIARD_ROOM));
		
		
	}
	@Test
	public void testPiecesAtLocation()
	{
		test.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		test.addPlayer("Jeremy", GamePiece.RED_RACER, Location.KITCHEN);
		ArrayList<GamePiece> res = new ArrayList<GamePiece>();
		res.add(GamePiece.YELLOW_BOOT);
		
		Assert.assertEquals(res, test.getGamePiecesAtLocation(Location.BILLIARD_ROOM));
		
	}
	@Test
	public void testGet()
	{
		test.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		test.addPlayer("Jeremy", GamePiece.RED_RACER, Location.KITCHEN);
		Set<String> tes = test.getPlayers();
		String [] expect = {"Ron", "Jeremy"};
		for (int x = 0; x < expect.length; x++)
		{
			Assert.assertTrue(tes.contains(expect[x]));
		}
	}
	@Test 
	public void testGetPlayerLocs()
	{
		test.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		test.addPlayer("Jeremy", GamePiece.RED_RACER, Location.KITCHEN);
		Set<Location> tes = test.getPlayerLocations();
		Location [] expect = {Location.BILLIARD_ROOM, Location.KITCHEN};
		for (int x = 0; x < expect.length; x++)
		{
			Assert.assertTrue(tes.contains(expect[x]));
		}
		
	}
	@Test
	public void testGetPieces()
	{
		test.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		test.addPlayer("Jeremy", GamePiece.RED_RACER, Location.KITCHEN);
		Set<GamePiece> tes = test.getPlayerPieces();
		GamePiece [] expect = {GamePiece.YELLOW_BOOT, GamePiece.RED_RACER};
		for (int x = 0; x < expect.length; x++)
		{
			Assert.assertTrue(tes.contains(expect[x]));
		}
	}
	
	
}

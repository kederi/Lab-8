package lab8;
import java.util.*;

public class BoardGame 
{
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	//TODO
	public BoardGame()
	{
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	//TODO
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, initialLocation);
		
	}
	//TODO
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	
	//TODO
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		String res = "";
		for(Map.Entry<String, GamePiece> setThe : playerPieces.entrySet())
		{
			if(setThe.getValue().equals(gamePiece))
			{
				res = setThe.getKey();
			}
		}
		return res;
	}
	
	//TODO
	public void movePlayer(String playerName, Location newLocation)
	{
		
	}
	//TODO
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		
	}
	//TODO
	public Location getPlayersLocation(String player)
	{
		
	}
	//TODO
	public ArrayList<GamePiece> getPlayersAtLocation(Location loc)
	{
		
	}
	//TODO
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		
	}
	//TODO
	public Set<String> getPlayers()
	{
		
	}
	//TODO
	public Set<Location> getPlayerLocations()
	{
		
	}
	//TODO
	public Set<GamePiece> getPlayerPieces()
	{
		
	}
}

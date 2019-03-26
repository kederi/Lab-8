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
		if (playerPieces.containsValue(gamePiece))
			return false;
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, initialLocation);
		return true;
		
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
		if (res.equals(""))
			return null;
		else 
			return res;
	}
	
	//TODO
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.replace(playerName, newLocation);
	}
	//TODO
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		GamePiece move = GamePiece.movesFirst(playerPieces.get(playerNames[0]), playerPieces.get(playerNames[1]));
		String [] order = new String[2];
		order[0] = getPlayerWithGamePiece(move);
		if(move.equals(playerPieces.get(playerNames[0])))
		{
			order[1] = getPlayerWithGamePiece(playerPieces.get(playerNames[1]));
			movePlayer(order[1], newLocations[1]);
			movePlayer(order[0], newLocations[0]);
		}
		else if (move.equals(playerPieces.get(playerNames[1])))
		{
			order[1] = getPlayerWithGamePiece(playerPieces.get(playerNames[1]));
			movePlayer(order[1], newLocations[0]);
			movePlayer(order[0], newLocations[1]);
		}
		return order;
		
	}
	//TODO
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	//TODO
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> players = new ArrayList<String>();
		for(Map.Entry<String, Location> setLoc : playerLocations.entrySet())
		{
			if(setLoc.getValue().equals(loc))
			{
				String name = setLoc.getKey();
				players.add(name);
			}
		}
		return players;
	}
	//TODO
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> players = new ArrayList<GamePiece>();
		for(Map.Entry<String, Location> setLoc : playerLocations.entrySet())
		{
			if(setLoc.getValue().equals(loc))
			{
				String name = setLoc.getKey();
				players.add(playerPieces.get(name));
			}
		}
		return players;
	}
	//TODO
	public Set<String> getPlayers()
	{
		return playerPieces.keySet();
	}
	//TODO
	public Set<Location> getPlayerLocations()
	{
		Set<Location> locs = new HashSet<Location>();
		for(Map.Entry<String, Location> setLoc : playerLocations.entrySet())
		{
			locs.add(setLoc.getValue());
		}
		return locs;
	}
	//TODO
	public Set<GamePiece> getPlayerPieces()
	{
		Set<GamePiece> locs = new HashSet<GamePiece>();
		for(Map.Entry<String, GamePiece> setPiece : playerPieces.entrySet())
		{
			locs.add(setPiece.getValue());
		}
		return locs;
	}
}

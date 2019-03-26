/*
 * The
 * @author Kobi Ederi
 */
package lab8;

import java.util.ArrayList;
import java.util.Set;

public class Driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BoardGame monopoly = new BoardGame();
		
		monopoly.addPlayer("Ron",GamePiece.YELLOW_BOOT,Location.BILLIARD_ROOM);
		monopoly.addPlayer("Jeremy", GamePiece.RED_RACER, Location.KITCHEN);
		
		GamePiece first = monopoly.getPlayerGamePiece("Ron");
		String ronRes = monopoly.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT);
		
		monopoly.movePlayer("Ron", Location.KITCHEN);
		String [] yeah = {"Ron", "Jeremy"};
		Location [] locs = {Location.HALL, Location.BILLIARD_ROOM};
		String [] dudes = monopoly.moveTwoPlayers(yeah, locs);
		
		Location ye = monopoly.getPlayersLocation("Ron");
		ArrayList<String> tes = monopoly.getPlayersAtLocation(Location.KITCHEN);
		ArrayList<GamePiece> tes2 = monopoly.getGamePiecesAtLocation(Location.KITCHEN);
		Set<String> play = monopoly.getPlayers();
		Set<Location> plays = monopoly.getPlayerLocations();
		Set<GamePiece> playss = monopoly.getPlayerPieces();
		
		
		

	}

}

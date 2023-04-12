import java.util.ArrayList;

public class SpawnShieldCommand extends Command{
	

	public SpawnShieldCommand(Object receiver, String[] args) {
		super(receiver, args);
	}
	
	public void Execute() {

		int x;
		int y;
		
		IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
		ArrayList<ArrayList<BoardComponent>> gameBoard = GameBoard.Instance().GetBoard();
		//parsing the arguments to integer to get the coordinates
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		BoardComponent square = gameBoard.get(x).remove(y);
		BoardComponent shield = factory.MakeShield(square);
		gameBoard.get(x).add(y,shield);
		square.SetParent(shield);
		System.out.println("Spawning shield at (" + args[0] + "," + args[1]+")");
		Square sq = (Square) square;
		sq.getSubject().detach(sq);
		sq.getSubject().attach((IObserver) shield);
	}

}

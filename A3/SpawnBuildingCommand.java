public class SpawnBuildingCommand extends Command{

	//Task 1

	public SpawnBuildingCommand(Object receiver, String[] args)
	{
		super(receiver, args);
	}
	
	public void Execute() {

		Square square = (Square) receiver;
		
		IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
		square.Add(factory.MakeBuilding());
		GameBoard.Instance().IncrementBuildingCount();
		System.out.println("Spawning building at (" + args[0] + "," + args[1]+")");
		square.getSubject().attach(square);
		
	}

}

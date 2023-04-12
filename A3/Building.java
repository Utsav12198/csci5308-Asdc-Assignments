// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings
// Buildings cannot have children.
public class Building extends BoardComponent implements IObserver
{
	private int buildingHealth;
	
	public Building()
	{
		super();
		buildingHealth = 2;
	}

	@Override
	public void Operation()
	{
		// Buildings just stand there, they don't do anything.
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void update() {
		decrementBldgHealth();
		if(getBuildingHealth() == 0)
		{
			this.parent.Remove(this);
			this.SetParent(null);
			GameBoard.Instance().DecrementBuildingCount();
		}
		
	}
	
	public void decrementBldgHealth() {
		
		buildingHealth = getBuildingHealth() - 1;
	}

	public int getBuildingHealth() {
		return buildingHealth;
	}
}
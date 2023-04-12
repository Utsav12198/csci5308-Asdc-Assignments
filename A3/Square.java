import java.util.ArrayList;

// Square is a composite, making up the Composite pattern (contains components)
public class Square extends BoardComponent implements IObserver
{
	private final ArrayList<BoardComponent> children;
	private ISubject subject;
	
	public ISubject getSubject() {
		return subject;
	}

	public Square()
	{
		super();
		children = new ArrayList<BoardComponent>();
		subject = new AsteroidImpacts();
	}

	@Override
	public void Operation()
	{
		ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(children);
		for (int i = 0; i < childrenCopy.size(); i++)
		{
			BoardComponent child = childrenCopy.get(i);
			child.Operation();
		}
	}

	@Override
	public void Add(BoardComponent child)
	{
	
		children.add(child);
		child.SetParent(this);
	}

	@Override
	public void Remove(BoardComponent child)
	{
		children.remove(child);
	}

	@Override
	public void update() {
		ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(children);
		for (int i = 0; i < childrenCopy.size(); i++)
		{
			IObserver child = (IObserver) childrenCopy.get(i);
			child.update();
		}
	}
}
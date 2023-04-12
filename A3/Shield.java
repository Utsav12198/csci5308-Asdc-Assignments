
public class Shield extends AbstractDecorator implements IObserver{

	private int health;
	
	Shield(BoardComponent component) {
		this.component = component;
		health = 2;
	}
	
	@Override
	public void Operation() {
		this.component.Operation();
	}

	@Override
	public void Add(BoardComponent child) {
		this.component.Add(child);
		
	}

	@Override
	public void Remove(BoardComponent child) {
		this.component.Add(child);
		
	}

	@Override
	public void update() {
		decrementShieldHealth();
		if(getHealth() == 0)
		{
			component.SetParent(null);
			Square comp = (Square) component;
			comp.getSubject().detach(this);
			comp.getSubject().attach(comp);
		}
		
	}
	
	public void decrementShieldHealth() {
		health--;
	}

	public int getHealth() {
		return health;
	}

}

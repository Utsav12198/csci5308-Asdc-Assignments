import java.util.ArrayList;
import java.util.Iterator;

public class AsteroidImpacts implements ISubject{
	
	ArrayList<IObserver> observers = new ArrayList<>();

	@Override
	public void attach(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void detach(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		for (Iterator itr = observers.iterator(); itr.hasNext();) {
			IObserver iObserver =(IObserver) itr.next();
			iObserver.update();
			
		}
		
		
	}


}

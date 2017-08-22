
public class ObservserPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new OctalObservser(subject);
		new PlusTenObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		subject.setState(10);
	}

}

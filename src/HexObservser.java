
public class HexObservser extends Observer {
	public HexObservser(Subject subject){
		this.subject=subject;
		this.subject.attach(this);
	}
		@Override
		public void update() {
			System.out.println("Hex String "+Integer.toHexString(subject.getState()));

		}

}

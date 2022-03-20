package class12;

public class Sub extends Base{
	private int temperature;
	
	private void adjustTemperature(int temperature) {
		this.temperature = temperature;
	}
	private class Closeure implements Adjustable{
		public void adjust(int temperature) {
			adjustTemperature(temperature);
		}
	}
	public Adjustable getCallBackReference() {
		return new Closeure();
	}

}

package ws.prova.eventing;

public class CountValue {

	public int count;
	
	public double value;
	
	public CountValue(int count, double value) {
		this.count = count;
		this.value = value;
	}

	@Override
	public String toString() {
		return "CountValue [count=" + count + ", value=" + value + "]";
	}

}

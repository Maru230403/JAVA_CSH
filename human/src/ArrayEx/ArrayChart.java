package ArrayEx;


public class ArrayChart {
	private int average;
	private int maximum;
	private int minimum;
			
			
	public ArrayChart() {
		
	}
	 
	public ArrayChart( int average, int maximum, int minimum) {
		this.average = average;
		this.maximum = maximum;
		this.minimum = minimum;
	}
	

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
		
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	@Override
	public String toString() {
		return "ArrayChart [average=" + average + ", maximum=" + maximum
				+ ", minimum=" + minimum + "]";
	}
	
}
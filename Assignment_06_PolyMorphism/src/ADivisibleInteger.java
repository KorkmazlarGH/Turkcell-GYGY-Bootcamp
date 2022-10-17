
public abstract class ADivisibleInteger {
	private int dividend;

	public ADivisibleInteger(int dividend) {
		super();
		this.dividend = dividend;
	}

	public int getDividend() {
		return dividend;
	}

	public void setDividend(int dividend) {
		this.dividend = dividend;
	}
	
	public abstract void printDivisionOperations();
}

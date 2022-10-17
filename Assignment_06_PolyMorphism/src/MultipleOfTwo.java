
public class MultipleOfTwo extends ADivisibleInteger implements IDivisibleByTwo {

	public MultipleOfTwo(int dividend) {
		super(dividend);
	}

	@Override
	public void divisionByTwo() {
		int dividend = super.getDividend();
		int divisor = 2;
		System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);	
	}

	@Override
	public void printDivisionOperations() {
		this.divisionByTwo();	
	}

}

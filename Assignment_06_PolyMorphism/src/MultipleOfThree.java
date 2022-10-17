
public class MultipleOfThree extends ADivisibleInteger implements IDivisibleByThree {

	public MultipleOfThree(int dividend) {
		super(dividend);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void divisionByThree() {
		int dividend = super.getDividend();
		int divisor = 3;
		System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);		
	}

	@Override
	public void printDivisionOperations() {
		this.divisionByThree();
	}

}

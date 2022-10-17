
public class MultipleOfSix extends ADivisibleInteger implements IDivisibleBySix{

	public MultipleOfSix(int dividend) {
		super(dividend);
	}

	@Override
	public void divisionByThree() {
		int dividend = super.getDividend();
		int divisor = 3;
		System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
	}

	@Override
	public void divisionByTwo() {
		int dividend = super.getDividend();
		int divisor = 2;
		System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
	}

	@Override
	public void divisionBySix() {
		int dividend = super.getDividend();
		int divisor = 6;
		System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
	}

	@Override
	public void printDivisionOperations() {
		this.divisionByTwo();
		this.divisionByThree();
		this.divisionBySix();
	}

}

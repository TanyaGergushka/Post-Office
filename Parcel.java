package postOffice;

public class Parcel extends AbsShipments {

	private boolean isBigSize = true;

	private boolean isBreakable = false;
	
	
//	public Parcel() {
//	this.setTax();
//	this.setDate();
//	
//	
//	}

	public boolean isBreakable() {
		return this.isBreakable;
	}

	public void setBreakable(boolean isBreakable) {
		this.isBreakable = isBreakable;
	}
	


	public void setTax() {
		this.tax = 2;
		
		if (isBigSize) {
			this.tax += this.getTax() * 0.5;
		}

		if (isBreakable) {
			this.tax += this.getTax() * 0.5;
		}

	}

	public double getTax() {
		return this.tax;
	}

	public boolean isBigSize() {
		return isBigSize;
	}

	public void setBigSize (boolean isBig){
		this.isBigSize = isBig;
	}
	protected void setBigSize(int a, int b, int c) {
		if (a <= 60 && b <= 60 && c <= 60) {
			this.isBigSize = false;
		}
	}

	@Override
	public void setMinutesToHandOver() {
	
	}

	@Override
	public void setType() {
		this.type = "parcel";
		
	}

}

package postOffice;

import java.time.LocalDateTime;

public class Letter extends AbsShipments {

	@Override
	public void setTax() {
		this.tax = 0.5;
	}

	@Override
	public void setMinutesToHandOver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setType() {
		this.type = "letter";
		
	}

	

}

package postOffice;

import java.time.LocalDate;

public abstract class AbsShipments {

	
	private Sender sender;
	private Receiver receiver;
	protected double tax;
	protected String type;
	private int minutesToHandOver;
	private LocalDate date = LocalDate.now();
	
	
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public Receiver getReceiver() {
		return receiver;
	}
	public String getType() {
		return type;
	}
	public abstract void setType();
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	public int getMinutesToHandOver() {
		return minutesToHandOver;
	}
	public abstract void setMinutesToHandOver() ;


	public double getTax() {
		return tax;
	}
	public abstract void setTax();
	
	

	
	
	
	
	
	
	
}

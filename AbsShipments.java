package postOffice;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class AbsShipments {

	
	private Sender sender;
	private Receiver receiver;
	protected double tax;
	protected String type;
	private int minutesToHandOver;
	private LocalDateTime date;
	
	
	
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
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate() {
		this.date = LocalDateTime.now();
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
}

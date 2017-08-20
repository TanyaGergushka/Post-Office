package postOffice;

import java.util.ArrayList;
import java.util.LinkedList;

public class PostMan extends Data {

	
	private int ageExperience;
	private boolean isVacant;
	private int countShipments;
	private LinkedList<AbsShipments> shipmentsList = new LinkedList<>();
	
	
	public int getAgeExperience() {
		return ageExperience;
	}
	protected void setAgeExperience(int ageExperience) {
		this.ageExperience = ageExperience;
	}
	public boolean isVacant() {
		return isVacant;
	}
	public void setVacant(boolean isVacant) {
		this.isVacant = isVacant;
	}
	public int getCountShipments() {
		return countShipments;
	}
	public void setCountShipments(int countShipments) {
		this.countShipments = countShipments;
	}
	public LinkedList<AbsShipments> getShipmentsList() {
		return shipmentsList;
	}
	public void setShipmentsList(AbsShipments shipmentsList) {
		this.shipmentsList.add(shipmentsList);
	}
	
	
}

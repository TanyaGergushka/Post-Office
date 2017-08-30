package postOffice;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Citizen extends Data {

	private Town town;
	private String adress;
	private AbsShipments shipment;
	

	Random ran = new Random();

	public void sendingALetterToBox() {
		shipment = new Letter();
		shipment.setTax();
		shipment.setType();
		int box = ran.nextInt(25);
		LetterBox letterBox = town.letterBoxesList.get(box);
		letterBox.setLetterInBox((Letter)shipment);
	}
	

	
	public void sendingAShipmentToPostOffice() {
		int random = (Math.random()<0.5)?0:1;
		AbsShipments shipments;
		//Instant instant = Instant.now();
		if (random == 0) {
			shipments = new Letter();
			shipments.setType();
			shipments.setTax();
			shipments.setDate();
			PostStation.setArchive(shipments);
			PostStation.setStorage(shipments);
			
		} else if (random == 1){
			boolean randon2 = (Math.random() < 0.5)? true:false;
			boolean randon3 = (Math.random() < 0.5)? true:false;
			shipments = new Parcel();
			shipments.setType();
			((Parcel) shipments).setBreakable(randon2);
			((Parcel) shipments).setBigSize(randon3);
			shipments.setTax();
			shipments.setDate();
			
			PostStation.setArchive(shipments);
			PostStation.setStorage(shipments);
		
		}

		

	}
}

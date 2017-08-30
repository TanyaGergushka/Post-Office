package postOffice;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DemoPostOffice {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		
		Town sofia = new Town();
		Parcel parcel = new Parcel();
		parcel.setBreakable(false);
		parcel.setBigSize(40, 60, 50);
		parcel.setTax();
		System.out.println(parcel.getTax());
		Letter letter = new Letter();
		letter.setTax();
		System.out.println(letter.getTax());

		for (int i = 0; i < 50; i++) {
			Citizen citizen = new Citizen();
			citizen.sendingALetterToBox();
			citizen.sendingAShipmentToPostOffice();
		}
		for (int i = 0; i < Town.letterBoxesList.size(); i++) {
			System.out.print(Town.letterBoxesList.get(i).getLetterInBox().size() + " ");

		}

		System.out.println();
		System.out.println(PostStation.getStorage().size());
		
		System.out.println(PostStation.getArchive().size());
	

	PostStation postNew = new PostStation();
		
		
		postNew.fullStorage();
		postNew.sentOut();
	}

}
